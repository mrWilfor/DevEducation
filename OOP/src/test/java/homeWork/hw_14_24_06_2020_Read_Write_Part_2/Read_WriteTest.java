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
    private static ConfigReader configReader;
    private static String ABSOLUTE_PATH;
    private static String COPIED_PATH;
    private static String COPIED_TXT_PATH;

    @BeforeAll
    static void init() throws IOException {
        configReader = new ConfigReader("C:\\Users\\HP 1406945\\IdeaProjects\\DevEducation\\OOP\\src\\" +
                "main\\java\\homeWork\\hw_15_26_06_2020_Part_2_Config_Reader\\config.properties",
                "path.from_hw_14", "path.toForCopyFiles_hw_14");
        ABSOLUTE_PATH = configReader.getSource();
        COPIED_PATH = configReader.getDestination();
        COPIED_TXT_PATH = configReader.getProps("props.toTxtFiles_hw_14");
    }


    @Test
    public void fewFiles_InfoAboutFilesFromDirToTxtFile_FileIsExist() throws IOException {
        File result = rw.infoAboutFilesFromDirToTxtFile(ABSOLUTE_PATH, "text1.txt");

        assertTrue(result.isFile(), "Txt file is not exist");
    }

    @Test
    public void fewFilesAndNotExistDir_InfoAboutFilesFromDirToTxtFile_IOException() {
        assertThrows(IOException.class,
                () -> rw.infoAboutFilesFromDirToTxtFile(ABSOLUTE_PATH, ABSOLUTE_PATH.concat("\\txtFile"),
                        "text2.txt"),
                "Folder of destination is exist!");
    }

    @Test
    public void notExistDir_InfoAboutFilesFromDirToTxtFile_TxtFileNotCreated() throws IOException {
        File result = rw.infoAboutFilesFromDirToTxtFile(ABSOLUTE_PATH.concat("\\txtFile"), ABSOLUTE_PATH,
                "text3.txt");

        assertFalse(result.isFile(), "Txt file was creating");
    }

    @Test
    public void fewFiles_copyAllFilesFromDirToDir_FilesCopied() {
        rw.copyAllFilesPathFromPathTo(ABSOLUTE_PATH, COPIED_PATH);

        File[] copiedFiles = new File(COPIED_PATH).listFiles();

        Stream.of(copiedFiles).forEach(x -> {
            assertTrue(x.exists(), "Files have not been copied");
        });
    }

    @Test
    public void notExistDirDestination_copyAllFilesFromDirToDir_FilesCopied() {
        rw.copyAllFilesPathFromPathTo(ABSOLUTE_PATH, COPIED_PATH.concat("\\copyFiles"));

        File[] copiedFiles = new File(COPIED_PATH.concat("\\copyFiles")).listFiles();

        Stream.of(copiedFiles).forEach(x -> {
            assertTrue(x.exists(), "Files have not been copied");
        });
    }

    @Test
    public void notExistDir_copyAllFilesFromDirToDir_NullPointerException() {
        assertThrows(
                NullPointerException.class,
                () -> rw.copyAllFilesPathFromPathTo(ABSOLUTE_PATH.concat("\\files"), COPIED_PATH),
                "This dir is exist"
        );
    }

    @Test
    public void fewTxtFiles_copyFewTxtFilesIntoOneTxtFile_CreatedTxtFile() throws IOException {
        File txtFile = rw.copyFewTxtFilesIntoOneTxtFile(COPIED_TXT_PATH, "AaBbCc.txt");

        assertTrue(txtFile.isFile(), "File have not been created");

        try (FileReader fr = new FileReader(txtFile); BufferedReader reader = new BufferedReader(fr)) {
            String result = reader.readLine();
            assertEquals("AaBbCc", result);
        }
    }

    @Test
    public void notExistDir_copyFewTxtFilesIntoOneTxtFile_NotCreatedTxtFile() throws IOException {
        File txtFile = rw.copyFewTxtFilesIntoOneTxtFile(COPIED_TXT_PATH.concat("\\files"), COPIED_TXT_PATH,
                "shortHistoryOfGroup_2");

        assertFalse(txtFile.isFile(), "File have been created");
    }
}