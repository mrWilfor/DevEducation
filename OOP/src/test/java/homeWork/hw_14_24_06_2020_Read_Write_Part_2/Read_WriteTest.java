package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;
import homeWork.hw_15_26_06_2020_Part_2_Config_Reader.ConfigReader;

import static org.junit.jupiter.api.Assertions.*;

class Read_WriteTest {
    Read_Write rw = new Read_Write_Impl();
    ConfigReader configReader = new ConfigReader("config_hw_14.properties");

    @Test
    public void fewFiles_infoAboutFilesFromDirToTxtFile_fileIsExist() throws IOException {
        File result = rw.infoAboutFilesFromDirToTxtFile(configReader.getSource(), "text1.txt");

        assertTrue(result.isFile(), "Txt file is not exist");
    }

    @Test
    public void fewFilesAndNotExistDir_infoAboutFilesFromDirToTxtFile_IOException() {
        assertThrows(IOException.class,
                () -> rw.infoAboutFilesFromDirToTxtFile(configReader.getSource(), configReader.getSource().concat("\\txtFile"),
                        "text2.txt"),
                "Folder of destination is exist!");
    }

    @Test
    public void notExistDir_infoAboutFilesFromDirToTxtFile_txtFileNotCreated() throws IOException {
        File result = rw.infoAboutFilesFromDirToTxtFile(configReader.getSource().concat("\\txtFile"), configReader.getSource(),
                "text3.txt");

        assertFalse(result.isFile(), "Txt file was creating");
    }

    @Test
    public void fewFiles_copyAllFilesFromDirToDir_filesCopied() {
        rw.copyAllFilesPathFromPathTo(configReader.getSource(), configReader.getDestination());

        File[] copiedFiles = new File(configReader.getDestination()).listFiles();

        assert copiedFiles != null;
        Stream.of(copiedFiles).forEach(x -> {
            assertTrue(x.exists(), "Files have not been copied");
        });
    }

    @Test
    public void notExistDirDestination_copyAllFilesFromDirToDir_filesCopied() {
        rw.copyAllFilesPathFromPathTo(configReader.getSource(), configReader.getDestination().concat("\\copyFiles"));

        File[] copiedFiles = new File(configReader.getDestination().concat("\\copyFiles")).listFiles();

        assert copiedFiles != null;
        Stream.of(copiedFiles).forEach(x -> {
            assertTrue(x.exists(), "Files have not been copied");
        });
    }

    @Test
    public void notExistDir_copyAllFilesFromDirToDir_NullPointerException() {
        assertThrows(
                NullPointerException.class,
                () -> rw.copyAllFilesPathFromPathTo(configReader.getSource().concat("\\files"), configReader.getDestination()),
                "This dir is exist"
        );
    }

    @Test
    public void fewTxtFiles_copyFewTxtFilesIntoOneTxtFile_createdTxtFile() throws IOException {
        File txtFile = rw.copyFewTxtFilesIntoOneTxtFile(configReader.getProps("props.toTxtFiles"), "AaBbCc.txt");

        assertTrue(txtFile.isFile(), "File have not been created");

        try (FileReader fr = new FileReader(txtFile); BufferedReader reader = new BufferedReader(fr)) {
            String result = reader.readLine();
            assertEquals("AaBbCc", result, "File is not contains text which we are expected");
        }
    }

    @Test
    public void notExistDir_copyFewTxtFilesIntoOneTxtFile_notCreatedTxtFile() throws IOException {
        File txtFile = rw.copyFewTxtFilesIntoOneTxtFile(configReader.getProps("props.toTxtFiles").concat("\\files"), configReader.getProps("props.toTxtFiles"),
                "shortHistoryOfGroup_2");

        assertFalse(txtFile.isFile(), "File have been created");
    }
}