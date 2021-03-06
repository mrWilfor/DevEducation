package homeWork.hw_15_26_06_2020_Archiver_Unarchiver;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import homeWork.hw_15_26_06_2020_Part_2_Config_Reader.ConfigReader;

import static org.junit.jupiter.api.Assertions.*;

class ArchiverAndUnArchiverImplTest {
    private static ConfigReader cr;
    private static ArchiverAndUnArchiver arch;

    @BeforeAll
    static void init() throws IOException {
        cr = new ConfigReader("config_hw_15.properties");
        arch = new ArchiverAndUnArchiverImpl();
    }

    @Test
    public void oneFile_archiving_archiveIsExistAndContainsText() throws FileNotFoundException {
        String result = null;

        arch.archiving(cr.getProps("path.toDirOfTest").concat("\\fileTxt.txt"), cr.getProps("path.toDirOfTest"), "archOne.zip");
        arch.unArchiving(cr.getProps("path.toDirOfTest").concat("\\archOne.zip"), cr.getDestination().concat("\\test4"));

        assertTrue(
                new File(cr.getProps("path.toDirOfTest").concat("\\archOne.zip")).isFile(),
                "Archive is not exist!"
        );

        File txtFile = new File(cr.getDestination().concat("\\test4").concat("\\fileTxt.txt"));

        try (FileReader fr = new FileReader(txtFile); BufferedReader reader = new BufferedReader(fr)) {
            result = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("123456789", result);
    }

    @Test
    public void fewFiles_archiving_archiveIsExist() throws FileNotFoundException {
        arch.archiving(cr.getSource(), cr.getProps("path.toDirOfTest"), "arch1.zip");

        assertTrue(
                new File(cr.getProps("path.toDirOfTest").concat("\\arch1.zip")).isFile(),
                "Archive is not exist!"
        );
    }

    @Test
    public void fewFilesAndFolder_archiving_archiveIsExist() throws FileNotFoundException {
        arch.archiving(cr.getProps("path.toSourceFilesWithFolder"),
                cr.getProps("path.toDirOfTest"), "arch2.zip");

        assertTrue(
                new File(cr.getProps("path.toDirOfTest").concat("\\arch2.zip")).isFile(),
                "Archive is not exist!"
        );
    }

    @Test
    public void archive_unArchiving_filesIsExistIntoDestination() throws FileNotFoundException {
        arch.unArchiving(cr.getProps("path.toDirOfTest").concat("\\arch1.zip"),
                cr.getDestination().concat("\\test1"));

        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\13-linkin_park-numb_(zvukoff.ru).mp3")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\LP_History_of_Group.txt")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\LPLogo-black.svg.png")).exists(),
                "File of folder is not exist"
        );
    }

    @Test
    public void archive_unArchiving_filesIsExistIntoStartingFolder() throws FileNotFoundException {
        arch.archiving(cr.getSource(), cr.getProps("path.toDirOfTest"), "arch1.zip");
        arch.unArchiving(cr.getProps("path.toDirOfTest").concat("\\").concat("arch1.zip"));

        assertTrue(
                new File(cr.getProps("path.toDirOfTest").concat("\\filesWithoutFolder").concat("\\13-linkin_park-numb_(zvukoff.ru)(1).mp3")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getProps("path.toDirOfTest").concat("\\filesWithoutFolder").concat("\\LP_History_of_Group(1).txt")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getProps("path.toDirOfTest").concat("\\filesWithoutFolder").concat("\\LPLogo-black.svg(1).png")).exists(),
                "File of folder is not exist"
        );
    }

    @Test
    public void nothing_archiving_FileNotFoundException() {
        assertThrows(
                FileNotFoundException.class,
                () -> arch.archiving(cr.getSource().concat("source"), cr.getProps("path.toDirOfTest"),
                        "arch3.zip"),
                "File is found"
        );
    }

    @Test
    public void nothing_unArchiving_FileNotFoundException() {
        assertThrows(
                FileNotFoundException.class,
                () -> arch.unArchiving(cr.getSource().concat("source").concat("\\arch1.zip"), cr.getDestination().concat("\\test2")),
                "File is found"
        );
    }
}