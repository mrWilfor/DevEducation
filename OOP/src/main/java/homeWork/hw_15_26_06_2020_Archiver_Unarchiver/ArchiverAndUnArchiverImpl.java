package homeWork.hw_15_26_06_2020_Archiver_Unarchiver;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ArchiverAndUnArchiverImpl implements ArchiverAndUnArchiver {
    @Override
    public void archiving(String pathFrom, String pathTo, String name) throws FileNotFoundException {
        if (!new File(pathFrom).exists()) {
            throw new FileNotFoundException("Source path is not exist!");
        }

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(pathTo.concat("\\").concat(name)))) {
            File file = new File(pathFrom);

            if (file.isDirectory()) {
                addFolderIntoArchive(zout, pathFrom, file.getName());
            } else {
                addFileIntoArchive(zout, pathFrom, file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void unArchiving(String pathFrom, String pathTo) throws FileNotFoundException {
        ZipEntry entry;
        String name;
        File newFile;
        int bufferCharCastedToInt;

        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("Archive is not exist!");
        }

        try (FileInputStream fis = new FileInputStream(new File(pathFrom)); ZipInputStream zin = new ZipInputStream(fis)) {
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName();
                newFile = new File(pathTo.concat("\\").concat(name));
                newFile = checkFilesIsExist(newFile);

                if (entry.isDirectory()) {
                    newFile.mkdir();
                } else {
                    new File(newFile.getParent()).mkdirs();
                }

                try (FileOutputStream fout = new FileOutputStream(newFile)) {
                    bufferCharCastedToInt = zin.read();

                    while (bufferCharCastedToInt != -1) {
                        fout.write(bufferCharCastedToInt);
                        bufferCharCastedToInt = zin.read();
                    }
                    zin.closeEntry();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void unArchiving(String pathFrom) throws FileNotFoundException {
        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("Archive is not exist!");
        }
        String pathTo = new File(pathFrom).getParent();

        unArchiving(pathFrom, pathTo);
    }

    @Override
    public void addFolderIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry) {
        File[] arrayOfFile = new File(pathFrom).listFiles();

        Stream.of(arrayOfFile).forEach(x -> {
            if (x.isFile()) {
                try (FileInputStream fis = new FileInputStream(x.getAbsolutePath())) {
                    ZipEntry entry = new ZipEntry(zipEntry.concat("\\").concat(x.getName()));

                    zout.putNextEntry(entry);

                    byte[] buffer = new byte[fis.available()];

                    fis.read(buffer);
                    zout.write(buffer);
                    zout.closeEntry();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                addFolderIntoArchive(zout, x.getAbsolutePath(), zipEntry.concat("\\").concat(x.getName()));
            }
        });
    }

    @Override
    public void addFileIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry) {
        File file = new File(pathFrom);

        try (FileInputStream fis = new FileInputStream(file.getAbsolutePath())) {
            ZipEntry entry = new ZipEntry(zipEntry);

            zout.putNextEntry(entry);

            byte[] buffer = new byte[fis.available()];

            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public File checkFilesIsExist(File file) {
        Pattern pattern = Pattern.compile("\\(\\d\\)");
        Matcher matcher = pattern.matcher(file.getName());
        int numberCastToInt;
        int index;
        String result;

        if (file.isFile()) {
            System.out.println(file.getName());

            if (matcher.find()) {
                String numberOfCopyOfFile = file.getName()
                        .substring(file.getName().lastIndexOf('(') + 1, file.getName().lastIndexOf(')'));
                numberCastToInt = Integer.parseInt(numberOfCopyOfFile);
                numberCastToInt++;
                result = matcher.replaceAll("(" + numberCastToInt + ")");
                file = new File(file.getParent().concat("\\").concat(result));
            } else {
                index = file.getAbsolutePath().lastIndexOf('.');
                file = new File(file.getAbsolutePath().substring(0, index).concat("(1)").concat(file.getAbsolutePath().substring(index)));
            }
            return checkFilesIsExist(file);
        }
        return file;
    }
}
