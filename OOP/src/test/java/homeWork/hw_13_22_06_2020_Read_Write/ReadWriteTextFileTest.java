package homeWork.hw_13_22_06_2020_Read_Write;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReadWriteTextFileTest {

    @BeforeAll
    static void createTxtFile() throws IOException {
        ReadWriteTextFile.serializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/Begining.txt",
                "Hello!\nHow do you do?\nWhats up man?");
    }

    @Test
    void textFile_ReadSortDSCSaveIntoNewFile_NewFile() throws IOException {

        ReadWriteTextFile.readSortByLengthWrite(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt",
                SequenceComparable.DSC
        );

        String expected = "How do you do?\nWhats up man?\nHello!";
        String actual = ReadWriteTextFile.deSerializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt");

        assertEquals(expected, actual, "NewFile.txt not contain expecting text");
    }

    @Test
    void textFile_ReadSortASCSaveIntoNewFile_NewFile() throws IOException {

        ReadWriteTextFile.readSortByLengthWrite(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt",
                SequenceComparable.ASC
        );

        String expected = "Hello!\nWhats up man?\nHow do you do?";
        String actual = ReadWriteTextFile.deSerializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt");

        assertEquals(expected, actual, "NewFile.txt not contain expecting text");
    }

    @Test
    void Nothing_ReadSortSaveIntoNewFile_FileNotFoundException() throws IOException {
        assertThrows(IOException.class, () -> ReadWriteTextFile.readSortByLengthWrite(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/NewFile.txt",
                SequenceComparable.DSC),
                "original file is had not found");
    }

    @Test
    void textFile_DivisionTextByFileByFirstChar_NewFiles() throws IOException {
        ReadWriteTextFile.divisionTextByFileByFirstChar(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/",
                " ", SequenceComparable.ASC
        );

        String expected_d = "do do ";
        String expected_h = "Hello How ";
        String expected_m = "man ";
        String expected_u = "up ";
        String expected_y = "you ";

        String actual_d = ReadWriteTextFile.deSerializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/d.txt");
        String actual_h = ReadWriteTextFile.deSerializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/h.txt");
        String actual_m = ReadWriteTextFile.deSerializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/m.txt");
        String actual_u = ReadWriteTextFile.deSerializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/u.txt");
        String actual_y = ReadWriteTextFile.deSerializing(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/y.txt");

        assertEquals(expected_d, actual_d, "File not contain expected text");
        assertEquals(expected_h, actual_h, "File not contain expected text");
        assertEquals(expected_m, actual_m, "File not contain expected text");
        assertEquals(expected_u, actual_u, "File not contain expected text");
        assertEquals(expected_y, actual_y, "File not contain expected text");
    }

    @Test
    void Nothing_DivisionTextByFileByFirstChar_FileNotFoundException() throws IOException {
        assertThrows(
                IOException.class,
                () -> ReadWriteTextFile.divisionTextByFileByFirstChar(
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/Begining.txt",
                "src/test/java/homeWork/hw_13_22_06_2020_Read_Write/txtFiles/",
                " ", SequenceComparable.ASC),
                "original file is had not found"
                );
    }
}
