package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Read_Write {
    File infoAboutFilesFromDirToTxtFile(String pathFrom, String pathTo, String fileName)
            throws IOException;

    File infoAboutFilesFromDirToTxtFile(String path, String fileName) throws IOException;

    void copyAllFilesPathFromPathTo(String pathFrom, String pathTo);

    File copyFewTxtFilesIntoOneTxtFile(String pathFrom, String pathTo, String fileName)
            throws IOException;

    File copyFewTxtFilesIntoOneTxtFile(String path, String fileName)
            throws IOException;

    String verticalTab(List<StringBuilder> paths, List<StringBuilder> names, List<String> date);
}
