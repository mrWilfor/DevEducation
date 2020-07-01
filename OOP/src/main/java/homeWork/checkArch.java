package homeWork;

import homeWork.hw_15_26_06_2020_Archiver_Unarchiver.ArchiverAndUnArchiver;
import homeWork.hw_15_26_06_2020_Archiver_Unarchiver.ArchiverAndUnArchiverImpl;

import java.io.FileNotFoundException;

public class checkArch {
    private static String PATH_FROM_TO = "C:\\Users\\HP 1406945\\Desktop";
    public static void main(String[] args) throws FileNotFoundException {
        ArchiverAndUnArchiver arch = new ArchiverAndUnArchiverImpl();
        arch.archiving(PATH_FROM_TO.concat("\\arch"), PATH_FROM_TO, "archive.zip");
        arch.unArchiving(PATH_FROM_TO.concat("\\archive.zip"), PATH_FROM_TO.concat("\\arch2"));
    }
}
