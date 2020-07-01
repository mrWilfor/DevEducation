package homeWork.hw_14_24_06_2020_Read_Write_Part_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Read_Write_Impl implements Read_Write {

    @Override
    public File infoAboutFilesFromDirToTxtFile(String pathFrom, String pathTo, String fileName)
            throws IOException {
        File txtFile = new File(pathTo, fileName);

        try (FileWriter fw = new FileWriter(txtFile, false)) {
            File[] files = new File(pathFrom).listFiles();
            List<StringBuilder> paths = new ArrayList<>();
            List<StringBuilder> names = new ArrayList<>();
            List<String> date = new ArrayList<>();

            Stream.of(files).forEach(file -> {
                paths.add(new StringBuilder(file.getAbsolutePath()));
                names.add(new StringBuilder(file.getName()));
                date.add(new Date(file.lastModified()).toString());
            });
            String result = verticalTab(paths, names, date);

            try {
                fw.write(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
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

        Stream.of(files).forEach(file -> {
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 FileOutputStream fileOutputStream = new FileOutputStream(pathTo.concat("\\").concat(file.getName()))) {
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
        File txtFile = new File(pathTo, fileName);

        try (FileWriter fw = new FileWriter(txtFile, false)) {
            File[] files = new File(pathFrom).listFiles();

            Stream.of(files).forEach(file -> {
                try (FileReader fr = new FileReader(file);
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

    @Override
    public String verticalTab(List<StringBuilder> paths, List<StringBuilder> names, List<String> date) {
        int lengthMaxPath = paths.stream().max(Comparator.comparingInt(path -> path.length())).get().length();

        paths.stream().forEach(path -> {
            while (path.length() != lengthMaxPath) {
                path.append(" ");
            }
        });

        int lengthMaxName = names.stream().max(Comparator.comparingInt(name -> name.length())).get().length();

        names.stream().forEach(name -> {
            while (name.length() != lengthMaxName) {
                name.append(" ");
            }
        });

        StringBuilder result = new StringBuilder();

        Stream.iterate(0, x -> x + 1).limit(paths.size()).forEach(x -> {
            result.append(paths.get(x)).append(" | ")
                    .append(names.get(x)).append(" | ")
                    .append(date.get(x)).append("\n");
        });
        return result.toString();
    }
}
