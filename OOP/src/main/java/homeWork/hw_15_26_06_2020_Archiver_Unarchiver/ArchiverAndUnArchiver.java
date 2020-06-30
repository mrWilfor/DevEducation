package homeWork.hw_15_26_06_2020_Archiver_Unarchiver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.zip.ZipOutputStream;

public interface ArchiverAndUnArchiver {
    void archiving(String pathFrom, String pathTo, String name) throws FileNotFoundException;

    void unArchiving(String pathFrom, String pathTo) throws FileNotFoundException;

    void unArchiving(String pathFrom) throws FileNotFoundException;

    void addFolderIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry);

    void addFileIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry);

    File checkFilesIsExist(File file);
}
