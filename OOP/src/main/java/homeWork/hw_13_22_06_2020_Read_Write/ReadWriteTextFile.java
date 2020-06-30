package homeWork.hw_13_22_06_2020_Read_Write;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReadWriteTextFile {

    /**
     * reads text of file, sort it by length of line and write into new file
     *
     * @param pathFrom path to the original file
     * @param pathTo path to the destination file
     * @param sc ascending sort sequence or descending sort sequence
     * @throws FileNotFoundException
     */
    void readSortByLengthWrite(String pathFrom, String pathTo, SequenceComparable sc) throws FileNotFoundException;

    /**
     * reads text of file, division by write, sort it by first character and write into new files
     *
     * @param pathFrom path to the original file
     * @param pathTo path to the destination files
     * @param sc ascending sort sequence or descending sort sequence
     * @throws FileNotFoundException
     */
    void divisionTextByFileByFirstChar(String pathFrom, String pathTo, SequenceComparable sc)
            throws FileNotFoundException;

    /**
     * copies files from path to path and replaces their names with random numbers
     *
     * @param pathFrom path to the original files
     * @param pathTo path to the destination files
     */
    void copyFewFiles(String pathFrom, String pathTo);

    /**
     * compares two strings from list by length
     *
     * @param listForSort list of Strings
     * @param sc ascending sort sequence or descending sort sequence
     */
    void compareStringByLength(List<String> listForSort, SequenceComparable sc);

    /**
     * compares two strings from list by first character
     *
     * @param listForSort list of Strings
     * @param sc ascending sort sequence or descending sort sequence
     */
    void compareStringByFirstChar(List<String> listForSort, SequenceComparable sc);

    /**
     * reads txt file and return text from it
     *
     * @param pathFrom path to the original file
     * @return String
     * @throws FileNotFoundException
     */
    String readFile(String pathFrom) throws FileNotFoundException;
}
