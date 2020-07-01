package homeWork.hw_15_26_06_2020_Archiver_Unarchiver;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.Deflater;
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
            zout.setLevel(Deflater.BEST_COMPRESSION);

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
    public void unArchiving(String pathFrom) throws FileNotFoundException {
        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("Archive is not exist!");
        }
        String pathTo = new File(pathFrom).getParent();

        unArchiving(pathFrom, pathTo);
    }

    @Override
    public void unArchiving(String pathFrom, String pathTo) throws FileNotFoundException {
        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("Archive is not exist!");
        }

        try (FileInputStream fis = new FileInputStream(new File(pathFrom));
             ZipInputStream zin = new ZipInputStream(fis)) {
            ZipEntry entry;

            while ((entry = zin.getNextEntry()) != null) {
                String name = entry.getName();
                File newFile = new File(pathTo.concat("\\").concat(name));
                newFile = checkFilesIsExist(newFile);

                if (entry.isDirectory()) {
                    newFile.mkdir();
                } else {
                    new File(newFile.getParent()).mkdirs();
                }

                try (FileOutputStream fout = new FileOutputStream(newFile)) {
                    byte[] buffer = new byte[1024];
                    int count;

                    while ((count = zin.read(buffer)) != -1) {
                        fout.write(buffer, 0 , count);
                    }
                    zin.closeEntry();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addFolderIntoArchive(ZipOutputStream zout, String pathFrom, String zipEntry) {
        File[] arrayOfFiles = new File(pathFrom).listFiles();

        assert arrayOfFiles != null;
        Stream.of(arrayOfFiles).forEach(file -> {
            if (file.isFile()) {
                try (FileInputStream fis = new FileInputStream(file.getAbsolutePath())) {
                    ZipEntry entry = new ZipEntry(zipEntry.concat("\\").concat(file.getName()));

                    zout.putNextEntry(entry);

                    byte[] buffer = new byte[fis.available()];

                    fis.read(buffer);
                    zout.write(buffer);
                    zout.closeEntry();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                addFolderIntoArchive(zout, file.getAbsolutePath(), zipEntry.concat("\\").concat(file.getName()));
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
        if (file.isFile()) {
            Pattern pattern = Pattern.compile("\\(\\d\\)");
            Matcher matcher = pattern.matcher(file.getName());

            if (matcher.find()) {
                String numberOfCopyOfFile = file.getName()
                        .substring(file.getName().lastIndexOf('(') + 1, file.getName().lastIndexOf(')'));
                int numberCastToInt = Integer.parseInt(numberOfCopyOfFile);
                numberCastToInt++;
                String result = matcher.replaceAll("(" + numberCastToInt + ")");
                file = new File(file.getParent().concat("\\").concat(result));
            } else {
                int index = file.getAbsolutePath().lastIndexOf('.');
                file = new File(file.getAbsolutePath().substring(0, index).concat("(1)").concat(file.getAbsolutePath().substring(index)));
            }
            return checkFilesIsExist(file);
        }
        return file;
    }
}
