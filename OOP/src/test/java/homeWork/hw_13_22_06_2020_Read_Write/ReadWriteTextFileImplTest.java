package homeWork.hw_13_22_06_2020_Read_Write;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.StringJoiner;

import homeWork.hw_15_26_06_2020_Part_2_Config_Reader.ConfigReader;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteTextFileImplTest {
    private ReadWriteTextFile readWriteTextFile = new ReadWriteTextFileImpl();
    private static ConfigReader configReader;

    @BeforeAll
    static void init() throws IOException {
        configReader = new ConfigReader("config_hw_13.properties");
    }

    @Test
    void textFile_readSortDSCSaveIntoNewFile_newFile() throws IOException {
        readWriteTextFile.readSortByLengthWrite(
                configReader.getSource(),
                configReader.getProps("props.toNewFile"),
                SequenceComparable.DSC
        );

        String expected = "How do you do?\nWhats up man?\nHello!";
        String actual = readFile(
                configReader.getProps("props.toNewFile"));

        assertEquals(expected, actual, "file is not contains text which we are expected!");
    }

    @Test
    void textFile_readSortASCSaveIntoNewFile_newFile() throws IOException {
        readWriteTextFile.readSortByLengthWrite(
                configReader.getSource(),
                configReader.getProps("props.toNewFile"),
                SequenceComparable.ASC
        );

        String expected = "Hello!\nWhats up man?\nHow do you do?";
        String actual = readFile(
                configReader.getProps("props.toNewFile"));

        assertEquals(expected, actual, "NewFile.txt not contain expecting text");
    }

    @Test
    void nothing_readSortSaveIntoNewFile_FileNotFoundException(){
        assertThrows(
                FileNotFoundException.class,
                () -> readWriteTextFile.readSortByLengthWrite(configReader.getSource().concat("/text/"),
                        configReader.getProps("props.toNewFile"), SequenceComparable.DSC),
                "original file is had not found"
        );
    }

    @Test
    void textFile_divisionTextByFileByFirstChar_newFiles() throws IOException {
        System.out.println("1");
        File file = new File(configReader.getSource().replace("\r", ""));
        System.out.println(file.isFile());
        System.out.println(file.getPath());
        System.out.println(configReader.getSource());
        System.out.println("1");
        readWriteTextFile.divisionTextByFileByFirstChar(configReader.getSource(), configReader.getDestination(),
                SequenceComparable.ASC);

        String expected_d = "do do";
        String expected_h = "How Hello";
        String expected_m = "man";
        String expected_u = "up";
        String expected_w = "Whats";
        String expected_y = "you";

        String actual_d = readFile(
                configReader.getDestination().concat("d.txt"));
        String actual_h = readFile(
                configReader.getDestination().concat("h.txt"));
        String actual_m = readFile(
                configReader.getDestination().concat("m.txt"));
        String actual_u = readFile(
                configReader.getDestination().concat("u.txt"));
        String actual_w = readFile(
                configReader.getDestination().concat("w.txt"));
        String actual_y = readFile(
                configReader.getDestination().concat("y.txt"));

        assertEquals(expected_d, actual_d, "File not contain expected text");
        assertEquals(expected_h, actual_h, "File not contain expected text");
        assertEquals(expected_m, actual_m, "File not contain expected text");
        assertEquals(expected_u, actual_u, "File not contain expected text");
        assertEquals(expected_w, actual_w, "File not contain expected text");
        assertEquals(expected_y, actual_y, "File not contain expected text");
    }

    @Test
    void nothing_divisionTextByFileByFirstChar_FileNotFoundException(){
        assertThrows(
                FileNotFoundException.class,
                () -> readWriteTextFile.divisionTextByFileByFirstChar(configReader.getSource().concat("/text/"),
                        configReader.getDestination(), SequenceComparable.ASC),
                "original file is had not found"
                );
    }

    @Test
    void fewFiles_copyFewFiles_createCopyingOfFiles() throws FileNotFoundException {
        readWriteTextFile.divisionTextByFileByFirstChar(configReader.getSource(), configReader.getDestination(),
                SequenceComparable.ASC);
        readWriteTextFile.copyFewFiles(configReader.getProps("path.fromForCopyFiles"),
                configReader.getProps("path.toForCopyFiles"));

        File file1 = new File(configReader.getProps("path.toForCopyFiles").concat("1.txt"));
        File file2 = new File(configReader.getProps("path.toForCopyFiles").concat("2.txt"));
        File file3 = new File(configReader.getProps("path.toForCopyFiles").concat("3.txt"));
        File file4 = new File(configReader.getProps("path.toForCopyFiles").concat("4.txt"));
        File file5 = new File(configReader.getProps("path.toForCopyFiles").concat("5.txt"));
        File file6 = new File(configReader.getProps("path.toForCopyFiles").concat("6.txt"));
        File file7 = new File(configReader.getProps("path.toForCopyFiles").concat("7.txt"));

        assertTrue(file1.isFile());
        assertTrue(file2.isFile());
        assertTrue(file3.isFile());
        assertTrue(file4.isFile());
        assertTrue(file5.isFile());
        assertTrue(file6.isFile());
        assertTrue(file7.isFile());
    }
    
    public String readFile(String pathFrom) {
        File txtFile = new File(pathFrom);
        StringJoiner result = new StringJoiner("\n");

        try (FileReader fr = new FileReader(txtFile);
             BufferedReader reader = new BufferedReader(fr)) {
            String bufferString;

            while ((bufferString = reader.readLine()) != null) {
                result.add(bufferString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
