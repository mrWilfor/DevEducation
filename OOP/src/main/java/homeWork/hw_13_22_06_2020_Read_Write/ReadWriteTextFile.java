package homeWork.hw_13_22_06_2020_Read_Write;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReadWriteTextFile {
    void readSortByLengthWrite(String pathFrom, String pathTo, SequenceComparable sc) throws FileNotFoundException;

    void divisionTextByFileByFirstChar(String pathFrom, String pathTo, SequenceComparable sc)
            throws FileNotFoundException;

    void copyFewFiles(String pathFrom, String pathTo);

    void compareStringByLength(List<String> listForSort, SequenceComparable sc);

    void compareStringByFirstChar(List<String> listForSort, SequenceComparable sc);

    String readFile(String pathFrom) throws FileNotFoundException;
}
