package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Read_Write {

    /**
     * reads info about files and writes it into txt file
     *
     * @param pathFrom path to original files
     * @param pathTo path to the destination file
     * @param fileName name of txt file
     * @return object of File.class
     * @throws IOException
     */
    File infoAboutFilesFromDirToTxtFile(String pathFrom, String pathTo, String fileName)
            throws IOException;

    /**
     * reads info about files and writes it into txt file in the same directory
     *
     * @param path path to original files and the destination file
     * @param fileName name of txt file
     * @return object of File.class
     * @throws IOException
     */
    File infoAboutFilesFromDirToTxtFile(String path, String fileName) throws IOException;

    /**
     * copies files from path to path
     *
     * @param pathFrom path to original files
     * @param pathTo path to destination files
     */
    void copyAllFilesPathFromPathTo(String pathFrom, String pathTo);

    /**
     * reads txt files and write it into the txt file
     *
     * @param pathFrom path to original files
     * @param pathTo path to the destination file
     * @param fileName file`s name
     * @return object of File.class
     * @throws IOException
     */
    File copyFewTxtFilesIntoOneTxtFile(String pathFrom, String pathTo, String fileName)
            throws IOException;

    /**
     *
     *
     * @param path path to original files and to the destination file
     * @param fileName file`s name
     * @return object of File.class
     * @throws IOException
     */
    File copyFewTxtFilesIntoOneTxtFile(String path, String fileName)
            throws IOException;

    /**
     * formats path, file`s name and date by vertical tab
     *
     * @param paths list of paths
     * @param names list of file names
     * @param date list of dates
     * @return all text formatted
     */
    String verticalTab(List<StringBuilder> paths, List<StringBuilder> names, List<String> date);
}
