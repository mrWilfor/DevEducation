package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import java.io.File;
import java.io.IOException;

public interface Read_Write {
    File listOfFilesFromDirToTxtFile(String filesFromDirectory, String txtFileToDirectory,
                                     String fileName) throws IOException;

    void copyAllFilesFromDirToDir(String filesFromDirectory, String filesToDirectory);

    File copyFewFilesIntoOneFile(String filesFromDirectory, String txtFileToDirectory, String fileName) throws IOException;
}
