package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

class Read_WriteTest {
    String ABSOLUTE_PATH = "C:\\Users\\HP 1406945\\IdeaProjects\\DevEducation\\OOP\\src\\test\\java\\" +
            "homeWork\\hw_14_24_06_2020_Read_Write_Part_2\\files";
    String COPIED_PATH = "C:\\Users\\HP 1406945\\IdeaProjects\\DevEducation\\OOP\\src\\test\\java\\" +
            "homeWork\\hw_14_24_06_2020_Read_Write_Part_2\\copyFiles";
    String COPIED_TXT_PATH = "C:\\Users\\HP 1406945\\IdeaProjects\\DevEducation\\OOP\\src\\test\\java\\" +
            "homeWork\\hw_14_24_06_2020_Read_Write_Part_2\\txtFiles";
    Read_Write rw = new Read_Write_Impl();

    @Test
    public void fewFiles_ListOfFilesFromDirToTxtFile_FileIsExist() throws IOException {
        File result = rw.listOfFilesFromDirToTxtFile(ABSOLUTE_PATH, ABSOLUTE_PATH, "text1.txt");

        assertTrue(result.exists(), "Txt file is not exist");
    }

    @Test
    public void fewFilesAndNotExistDir_ListOfFilesFromDirToTxtFile_IOException() {
        assertThrows(IOException.class,
                () -> rw.listOfFilesFromDirToTxtFile(ABSOLUTE_PATH, ABSOLUTE_PATH.concat("\\txtFile"),
                        "text2.txt"),
                "Folder of destination is exist!");
    }

    @Test
    public void notExistDir_ListOfFilesFromDirToTxtFile_TxtFileNotCreated() throws IOException {
        File result = rw.listOfFilesFromDirToTxtFile(ABSOLUTE_PATH.concat("\\txtFile"), ABSOLUTE_PATH,
                "text3.txt");

        assertFalse(result.exists(), "Txt file was creating");
    }

    @Test
    public void fewFiles_copyAllFilesFromDirToDir_FilesCopied() {
        rw.copyAllFilesFromDirToDir(ABSOLUTE_PATH, COPIED_PATH);

        File[] copiedFiles = new File(COPIED_PATH).listFiles();

        Stream.of(copiedFiles).forEach(x -> {
            assertTrue(x.exists(), "Files have not been copied");
        });
    }

    @Test
    public void notExistDirDestination_copyAllFilesFromDirToDir_FilesCopied() {
        rw.copyAllFilesFromDirToDir(ABSOLUTE_PATH, COPIED_PATH.concat("\\copyFiles"));

        File[] copiedFiles = new File(COPIED_PATH.concat("\\copyFiles")).listFiles();

        Stream.of(copiedFiles).forEach(x -> {
            assertTrue(x.exists(), "Files have not been copied");
        });
    }

    @Test
    public void notExistDir_copyAllFilesFromDirToDir_NullPointerException() {
        assertThrows(
                NullPointerException.class,
                () -> rw.copyAllFilesFromDirToDir(ABSOLUTE_PATH.concat("\\files"), COPIED_PATH),
                "This dir is exist"
        );
    }

    @Test
    public void fewTxtFiles_copyFewFilesIntoOneFile_CreatedTxtFile() throws IOException {
        File txtFile = rw.copyFewFilesIntoOneFile(COPIED_TXT_PATH, COPIED_TXT_PATH, "shortHistoryOfGroup");

        assertTrue(txtFile.exists(), "File have not been created");
    }

    @Test
    public void notExistDir_copyFewFilesIntoOneFile_NotCreatedTxtFile() throws IOException {
        File txtFile = rw.copyFewFilesIntoOneFile(COPIED_TXT_PATH.concat("\\files"), COPIED_TXT_PATH,
                "shortHistoryOfGroup_2");

        assertFalse(txtFile.exists(),"File have been created");
    }
}