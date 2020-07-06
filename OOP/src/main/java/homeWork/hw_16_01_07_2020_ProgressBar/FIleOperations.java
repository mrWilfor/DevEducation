package homeWork.hw_16_01_07_2020_ProgressBar;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.*;

public class FIleOperations {
    public void copy(String pathFrom, String pathTo, int sizeOfBuffer) {
        Date startProgram = new Date();
        File file = new File(pathFrom);

        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fout = new FileOutputStream(pathTo.concat("\\").concat(file.getName()))) {
            byte[] buffer = new byte[sizeOfBuffer];
            int length;
            int lengthSum = 0;

            while ((length = fis.read(buffer)) != -1) {
                lengthSum += length;

                fout.write(buffer, 0, length);
                bar(file, lengthSum, startProgram);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void archiving(String pathFrom, String pathTo, String name, int sizeOfBuffer) throws FileNotFoundException {
        if (!new File(pathFrom).exists()) {
            throw new FileNotFoundException("Source path is not exist!");
        }

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(pathTo.concat("\\").concat(name)))) {
            zout.setLevel(Deflater.BEST_COMPRESSION);

            File file = new File(pathFrom);

            if (file.isDirectory()) {
                addFolderIntoArchive(zout, pathFrom, file.getName(), sizeOfBuffer);
            } else {
                addFileIntoArchive(zout, pathFrom, file.getName(), sizeOfBuffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void unArchiving(String pathFrom, int sizeOfBuffer) throws FileNotFoundException {
        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("Archive is not exist!");
        }
        String pathTo = new File(pathFrom).getParent();

        unArchiving(pathFrom, pathTo, sizeOfBuffer);
    }

    public void unArchiving(String pathFrom, String pathTo, int sizeOfBuffer) throws FileNotFoundException {
        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("Archive is not exist!");
        }

        try (FileInputStream fis = new FileInputStream(new File(pathFrom));
             ZipInputStream zin = new ZipInputStream(fis)) {
            ZipEntry entry;

            while ((entry = zin.getNextEntry()) != null) {
                String name = entry.getName();
                File newFile = new File(pathTo.concat("/").concat(name));
                ZipFile zf = new ZipFile(pathFrom);
                newFile = checkFilesIsExist(newFile);

                if (entry.isDirectory()) {
                    newFile.mkdir();
                } else {
                    new File(newFile.getParent()).mkdirs();
                }

                try (FileOutputStream fout = new FileOutputStream(newFile)) {
                    byte[] buffer = new byte[sizeOfBuffer];
                    int length;
                    int lengthSum = 0;
                    Date startUnArchivingOfFile = new Date();

                    while ((length = zin.read(buffer)) != -1) {
                        lengthSum += length;

                        fout.write(buffer, 0, length);
                        bar(entry, zf, lengthSum, startUnArchivingOfFile);
                    }
                    zin.closeEntry();
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addFolderIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry, int sizeOfBuffer) {
        File[] arrayOfFiles = new File(pathFrom).listFiles();

        assert arrayOfFiles != null;
        Stream.of(arrayOfFiles).forEach(file -> {
            if (file.isFile()) {
                addFileIntoArchive(zout, file.getAbsolutePath(), zipEntry.concat("/" + file.getName()), sizeOfBuffer);
            } else {
                addFolderIntoArchive(zout, file.getAbsolutePath(), zipEntry.concat("/").concat(file.getName()), sizeOfBuffer);
            }
        });
    }

    private void addFileIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry, int sizeOfBuffer) {
        File file = new File(pathFrom);

        try (FileInputStream fis = new FileInputStream(file)) {
            ZipEntry entry = new ZipEntry(zipEntry);
            zout.putNextEntry(entry);
            entry.setSize(file.length());

            byte[] buffer = new byte[sizeOfBuffer];
            int length;
            int lengthSum = 0;
            Date startArchivingOfFile = new Date();

            while ((length = fis.read(buffer)) != -1) {
                lengthSum += length;

                zout.write(buffer, 0, length);
                bar(file, lengthSum, startArchivingOfFile);
            }
            zout.closeEntry();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File checkFilesIsExist(File file) {
        if (file.isFile()) {
            Pattern pattern = Pattern.compile("\\(\\d\\)");
            Matcher matcher = pattern.matcher(file.getName());

            if (matcher.find()) {
                String numberOfCopyOfFile = file.getName()
                        .substring(file.getName().lastIndexOf('(') + 1, file.getName().lastIndexOf(')'));
                int numberCastToInt = Integer.parseInt(numberOfCopyOfFile);
                numberCastToInt++;
                String result = matcher.replaceAll("(" + numberCastToInt + ")");
                file = new File(file.getParent().concat("/").concat(result));
            } else {
                int index = file.getAbsolutePath().lastIndexOf('.');
                file = new File(file.getAbsolutePath().substring(0, index).concat("(1)").concat(file.getAbsolutePath().substring(index)));
            }
            return checkFilesIsExist(file);
        }
        return file;
    }

    public String readFile(String pathFrom, int sizeOfBuffer) throws FileNotFoundException {
        File file = new File(pathFrom);
        StringBuilder result = new StringBuilder();

        if (file.isFile()) {
            try (FileReader fr = new FileReader(file)) {
                char[] bufferArray = new char[sizeOfBuffer];
                int length;
                int lengthSum = 0;
                Date startReadOfFile = new Date();

                while ((length = fr.read(bufferArray)) != -1) {
                    lengthSum += length;

                    bar(file, lengthSum, startReadOfFile);
                    result.append(bufferArray);
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new FileNotFoundException("this is not file");
        }
        return result.toString();
    }

    public void writeFile(String pathFrom, String pathTo, int sizeOfBuffer) throws IOException {
        File fileFrom = new File(pathFrom);
        File fileTo = new File(pathTo);
        StringBuilder result = new StringBuilder();

        try (FileReader fr = new FileReader(fileFrom);
             FileWriter fw = new FileWriter(fileTo)) {
            char[] bufferArray = new char[sizeOfBuffer];
            int length;
            int lengthSum = 0;
            Date startWriteOfFile = new Date();

            while ((length = fr.read(bufferArray)) != -1) {
                lengthSum += length;

                fw.write(bufferArray, 0, length);
                bar(fileFrom, lengthSum, startWriteOfFile);
                result.append(bufferArray);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void bar(File originFile, int sizeOfPartOfFileCopied, Date startProgram) {
        double percent = new BigDecimal(((double) sizeOfPartOfFileCopied / (double) originFile.length()) * 100)
                .setScale(2, RoundingMode.HALF_EVEN)
                .doubleValue();
        StringBuilder nameOfFile = new StringBuilder(originFile.getName());

        while (nameOfFile.length() < 40) {
            nameOfFile.append(" ");
        }

        int i = 0;

        if (percent != 100.00) {
            System.out.print("\r");
            System.out.print(nameOfFile);
            System.out.print("\t[in progress...]");
        } else {
            System.out.print("\r");
            System.out.print(nameOfFile);
            System.out.print("\t[Done]          ");
        }
        System.out.print("\t" + percent + "%");
        System.out.print("\t[");

        for (; i < (int) (percent * 50) / 100; i++) {
            System.out.print("*");
        }

        for (; i < 50; i++) {
            System.out.print(".");
        }
        System.out.print("]");

        Date interimDate = new Date();

        double timeToFinish = new BigDecimal((double) (interimDate.getTime() - startProgram.getTime()) / 1000.00 / percent * (100.00 - percent))
                .setScale(1, RoundingMode.HALF_EVEN)
                .doubleValue();

        System.out.print("\ttime to finish: " + timeToFinish + " second");
    }

    private void bar(ZipEntry entry, ZipFile zf, int sizeOfPartOfFileCopied, Date startProgram) {
        double percent = new BigDecimal(
                ((double) sizeOfPartOfFileCopied / (double) zf.getEntry(entry.getName()).getSize()) * 100)
                .setScale(2, RoundingMode.HALF_EVEN)
                .doubleValue();
        StringBuilder nameOfFile = new StringBuilder(entry.getName());

        while (nameOfFile.length() < 40) {
            nameOfFile.append(" ");
        }

        int i = 0;

        if (percent != 100.00) {
            System.out.print("\r");
            System.out.print(nameOfFile);
            System.out.print("\t[in progress...]");
        } else {
            System.out.print("\r");
            System.out.print(nameOfFile);
            System.out.print("\t[Done]          ");
        }
        System.out.print("\t" + percent + "%");
        System.out.print("\t[");

        for (; i < (int) (percent * 50) / 100; i++) {
            System.out.print("*");
        }

        for (; i < 50; i++) {
            System.out.print(".");
        }
        System.out.print("]");

        Date interimDate = new Date();
        double timeToFinish = new BigDecimal((double) (interimDate.getTime() - startProgram.getTime()) / 1000.00 / percent * (100.00 - percent))
                .setScale(1, RoundingMode.HALF_EVEN)
                .doubleValue();

        System.out.print("\ttime to finish: " + timeToFinish + " second");
    }
}
