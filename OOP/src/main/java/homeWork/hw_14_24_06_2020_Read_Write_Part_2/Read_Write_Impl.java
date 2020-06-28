package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import java.io.*;
import java.util.Date;
import java.util.stream.Stream;

public class Read_Write_Impl implements Read_Write {

    @Override
    public File infoAboutFilesFromDirToTxtFile(String pathFrom, String pathTo, String fileName)
            throws IOException {
        File[] files = new File(pathFrom).listFiles();
        File txtFile = new File(pathTo, fileName);

        try (FileWriter fw = new FileWriter(txtFile, false)) {
            Stream.of(files).forEach(x -> {
                try {
                    fw.write(x.getAbsolutePath().concat(" | ")
                            .concat(x.getName()).concat(" | ")
                            .concat(new Date(x.lastModified()).toString()).concat("\n"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (NullPointerException e) {
            System.out.println("Folder is empty");
            txtFile.delete();
        }
        return txtFile;
    }

    @Override
    public File infoAboutFilesFromDirToTxtFile(String path, String fileName) throws IOException {
        return infoAboutFilesFromDirToTxtFile(path, path, fileName);
    }

    @Override
    public void copyAllFilesPathFromPathTo(String pathFrom, String pathTo) {
        File[] files = new File(pathFrom).listFiles();

        Stream.of(files).forEach(x -> {
            try (FileInputStream fileInputStream = new FileInputStream(x);
                 FileOutputStream fileOutputStream = new FileOutputStream(pathTo.concat("\\").concat(x.getName()))) {
                byte[] bufferArray = new byte[fileInputStream.available()];

                fileInputStream.read(bufferArray, 0, bufferArray.length);
                fileOutputStream.write(bufferArray, 0, bufferArray.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public File copyFewTxtFilesIntoOneTxtFile(String pathFrom, String pathTo, String fileName) throws IOException {
        File[] files = new File(pathFrom).listFiles();
        File txtFile = new File(pathTo, fileName);

        try (FileWriter fw = new FileWriter(txtFile, false)) {
            Stream.of(files).forEach(x -> {
                try (FileReader fr = new FileReader(x);
                     BufferedReader br = new BufferedReader(fr)) {
                    String bufferString;
                    StringBuilder result = new StringBuilder();

                    while ((bufferString = br.readLine()) != null) {
                        result.append(bufferString);
                    }
                    fw.write(result.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (NullPointerException e) {
            System.out.println("Folder is empty");
            txtFile.delete();
        }

        return txtFile;
    }

    @Override
    public File copyFewTxtFilesIntoOneTxtFile(String path, String fileName) throws IOException {
        return copyFewTxtFilesIntoOneTxtFile(path, path, fileName);
    }
}
