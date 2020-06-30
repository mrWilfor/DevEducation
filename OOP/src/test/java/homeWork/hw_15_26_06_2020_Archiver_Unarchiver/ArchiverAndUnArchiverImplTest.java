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
        System.out.println();
        cr = new ConfigReader("C:\\Users\\HP 1406945\\IdeaProjects\\DevEducation\\OOP\\src\\main\\" +
                "java\\homeWork\\hw_15_26_06_2020_Part_2_Config_Reader\\config.properties",
                "path.toSourceFilesWithoutFolder_hw_15", "path.toUnarchivedFiles_hw_15");
        arch = new ArchiverAndUnArchiverImpl();
    }

    @Test
    public void oneFile_Archiving_ArchiveIsExistAndContainsText() throws FileNotFoundException {
        String result = null;

        arch.archiving(cr.getProps("path.toDirOfTest_hw_15").concat("\\fileTxt.txt"), cr.getProps("path.toDirOfTest_hw_15"), "archOne.zip");
        arch.unArchiving(cr.getProps("path.toDirOfTest_hw_15").concat("\\archOne.zip"), cr.getDestination().concat("\\test4"));

        assertTrue(
                new File(cr.getProps("path.toDirOfTest_hw_15").concat("\\archOne.zip")).isFile(),
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
    public void fewFiles_Archiving_ArchiveIsExist() throws FileNotFoundException {
        arch.archiving(cr.getSource(), cr.getProps("path.toDirOfTest_hw_15"), "arch1.zip");

        assertTrue(
                new File(cr.getProps("path.toDirOfTest_hw_15").concat("\\arch1.zip")).isFile(),
                "Archive is not exist!"
        );
    }

    @Test
    public void fewFilesAndFolder_Archiving_ArchiveIsExist() throws FileNotFoundException {
        arch.archiving(cr.getProps("path.toSourceFilesWithFolder_hw_15"),
                cr.getProps("path.toDirOfTest_hw_15"), "arch2.zip");

        assertTrue(
                new File(cr.getProps("path.toDirOfTest_hw_15").concat("\\arch2.zip")).isFile(),
                "Archive is not exist!"
        );
    }

    @Test
    public void archive_unArchiving_filesIsExistIntoDestination() throws FileNotFoundException {
        arch.unArchiving(cr.getProps("path.toDirOfTest_hw_15").concat("\\arch1.zip"),
                cr.getDestination().concat("\\test1"));

        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\13-linkin_park-numb_(zvukoff.ru).mp3")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\13-linkin_park-numb_(zvukoff.ru)(1).mp3")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\LP_History_of_Group.txt")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\LP_History_of_Group(1).txt")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\LPLogo-black.svg.png")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getDestination().concat("\\test1").concat("\\filesWithoutFolder").concat("\\LPLogo-black.svg(1).png")).exists(),
                "File of folder is not exist"
        );
    }

    @Test
    public void archive_unArchiving_filesIsExistIntoStartingFolder() throws FileNotFoundException {
        arch.archiving(cr.getSource(), cr.getProps("path.toDirOfTest_hw_15"), "arch1.zip");
        arch.unArchiving(cr.getProps("path.toDirOfTest_hw_15").concat("\\").concat("arch1.zip"));

        assertTrue(
                new File(cr.getProps("path.toDirOfTest_hw_15").concat("\\filesWithoutFolder").concat("\\13-linkin_park-numb_(zvukoff.ru)(1).mp3")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getProps("path.toDirOfTest_hw_15").concat("\\filesWithoutFolder").concat("\\LP_History_of_Group(1).txt")).exists(),
                "File of folder is not exist"
        );
        assertTrue(
                new File(cr.getProps("path.toDirOfTest_hw_15").concat("\\filesWithoutFolder").concat("\\LPLogo-black.svg(1).png")).exists(),
                "File of folder is not exist"
        );
    }

    @Test
    public void nothing_Archiving_FileNotFoundException() {
        assertThrows(
                FileNotFoundException.class,
                () -> arch.archiving(cr.getSource().concat("source"), cr.getProps("path.toDirOfTest_hw_15"),
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