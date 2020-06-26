package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

public class Read_Write_Impl implements Read_Write {

    @Override
    public File listOfFilesFromDirToTxtFile(String filesFromDirectory, String txtFileToDirectory, String fileName)
            throws IOException {
        File[] files = new File(filesFromDirectory).listFiles();
        File txtFile = new File(txtFileToDirectory, fileName);
        FileWriter fw;

        txtFile.createNewFile();

        fw = new FileWriter(txtFile, false);

        try {
            Stream.of(files).forEach(x -> {
                try {
                    fw.write(x.getAbsolutePath().concat(" | ").concat(x.getName()).concat(" | ")
                            .concat(new Date(x.lastModified()).toString()).concat("\n"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (NullPointerException e) {
            System.out.println("Folder is empty");
            fw.close();
            txtFile.delete();
        }

        fw.close();
        return txtFile;
    }

    @Override
    public void copyAllFilesFromDirToDir(String filesFromDirectory, String filesToDirectory) {
        File[] files = new File(filesFromDirectory).listFiles();

        Stream.of(files).forEach(x -> {
            try {
                FileUtils.copyFile(x, new File(filesToDirectory.concat("\\").concat(x.getName())));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public File copyFewFilesIntoOneFile(String filesFromDirectory, String txtFileToDirectory, String fileName)
            throws IOException {
        File[] files = new File(filesFromDirectory).listFiles();
        File txtFile = new File(txtFileToDirectory, fileName);
        FileWriter fw;

        txtFile.createNewFile();

        fw = new FileWriter(txtFile, false);

        try {
            Stream.of(files).forEach(x -> {
                try {
                    int c;
                    ArrayList<Character> arrayChar = new ArrayList<>();
                    FileReader fr = new FileReader(x);
                    char[] newArrayChar;
                    String result;

                    while ((c = fr.read()) != -1) {
                        arrayChar.add((char) c);
                    }
                    newArrayChar = new char[arrayChar.size()];

                    for (int i = 0; i < newArrayChar.length; i++) {
                        newArrayChar[i] = arrayChar.get(i);
                    }
                    result = new String(newArrayChar);

                    fw.write(result);
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (NullPointerException e) {
            System.out.println("Folder is empty");
            fw.close();
            txtFile.delete();
        }

        fw.close();
        return txtFile;
    }
}
