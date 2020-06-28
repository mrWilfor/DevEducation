package homeWork.hw_13_22_06_2020_Read_Write;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteTextFileImplTest {
    ReadWriteTextFile readWriteTextFile = new ReadWriteTextFileImpl();

    @Test
    void textFile_ReadSortDSCSaveIntoNewFile_NewFile() throws IOException {
        readWriteTextFile.readSortByLengthWrite(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt",
                SequenceComparable.DSC
        );

        String expected = "How do you do?\nWhats up man?\nHello!";
        String actual = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt");

        assertEquals(expected, actual);
    }

    @Test
    void textFile_ReadSortASCSaveIntoNewFile_NewFile() throws IOException {
        readWriteTextFile.readSortByLengthWrite(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt",
                SequenceComparable.ASC
        );

        String expected = "Hello!\nWhats up man?\nHow do you do?";
        String actual = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt");

        assertEquals(expected, actual, "NewFile.txt not contain expecting text");
    }

    @Test
    void nothing_ReadSortSaveIntoNewFile_FileNotFoundException(){
        assertThrows(FileNotFoundException.class, () -> readWriteTextFile.readSortByLengthWrite(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt",
                SequenceComparable.DSC),
                "original file is had not found");
    }

    @Test
    void textFile_DivisionTextByFileByFirstChar_NewFiles() throws IOException {
        readWriteTextFile.divisionTextByFileByFirstChar(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/", SequenceComparable.ASC);

        String expected_d = "do do";
        String expected_h = "How Hello";
        String expected_m = "man";
        String expected_u = "up";
        String expected_w = "Whats";
        String expected_y = "you";
//
        String actual_d = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/d.txt");
        String actual_h = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/h.txt");
        String actual_m = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/m.txt");
        String actual_u = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/u.txt");
        String actual_w = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/w.txt");
        String actual_y = readWriteTextFile.readFile(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/y.txt");

        assertEquals(expected_d, actual_d, "File not contain expected text");
        assertEquals(expected_h, actual_h, "File not contain expected text");
        assertEquals(expected_m, actual_m, "File not contain expected text");
        assertEquals(expected_u, actual_u, "File not contain expected text");
        assertEquals(expected_w, actual_w, "File not contain expected text");
        assertEquals(expected_y, actual_y, "File not contain expected text");
    }

    @Test
    void nothing_DivisionTextByFileByFirstChar_FileNotFoundException(){
        assertThrows(
                FileNotFoundException.class,
                () -> readWriteTextFile.divisionTextByFileByFirstChar(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/", SequenceComparable.ASC),
                "original file is had not found"
                );
    }

    @Test
    void fewFiles_copyFewFiles_CreateCopyingOfFiles() {
        readWriteTextFile.copyFewFiles("src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/copyFiles/");

        File file1 = new File("src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/copyFiles/1.txt");
        File file2 = new File("src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/copyFiles/2.txt");
        File file3 = new File("src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/copyFiles/3.txt");
        File file4 = new File("src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/copyFiles/4.txt");
        File file5 = new File("src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/copyFiles/5.txt");
        File file6 = new File("src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/copyFiles/6.txt");

        assertTrue(file1.isFile());
        assertTrue(file2.isFile());
        assertTrue(file3.isFile());
        assertTrue(file4.isFile());
        assertTrue(file5.isFile());
        assertTrue(file6.isFile());
    }
}
