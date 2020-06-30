package homeWork.hw_15_26_06_2020_Archiver_Unarchiver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.zip.ZipOutputStream;

public interface ArchiverAndUnArchiver {

    /**
     * archives files from folder to the destination zip folder
     *
     * @param pathFrom path to original files
     * @param pathTo path to the destination zip folder
     * @param name name of zip folder
     * @throws FileNotFoundException
     */
    void archiving(String pathFrom, String pathTo, String name) throws FileNotFoundException;

    /**
     * unarchives zip folder to the destination path
     *
     * @param pathFrom path to the zip folder
     * @param pathTo path to the destination path
     * @throws FileNotFoundException
     */
    void unArchiving(String pathFrom, String pathTo) throws FileNotFoundException;

    /**
     * unarchives zip folder to the same path
     *
     * @param pathFrom path to the zip folder and to the destination path
     * @throws FileNotFoundException
     */
    void unArchiving(String pathFrom) throws FileNotFoundException;

    /**
     * add folder and all files in it to archive
     *
     * @param zout zip output stream
     * @param pathFrom path to original folder
     * @param zipEntry zip entry
     */
    void addFolderIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry);

    /**
     * add a file into archive
     *
     * @param zout zip output stream
     * @param pathFrom path to original file
     * @param zipEntry zip entry
     */
    void addFileIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry);

    /**
     * check file exists in the destination path when unzipping and rename if it exists
     *
     * @param file object File.class
     * @return object File.class
     */
    File checkFilesIsExist(File file);
}
