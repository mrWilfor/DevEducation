package homeWork.hw_16_01_07_2020_ProgressBar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.StringJoiner;

public class ProgressBarService {
    public static void main(String[] args) throws IOException {
        FIleOperations fIleOperations = new FIleOperations();
        File fileForResult = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/results.txt");

        initialisationOfFileForResult(fileForResult);

        GregorianCalendar dateBefore = new GregorianCalendar();

        System.out.println("\nCOPY:\n");
        fIleOperations.copy(
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/" +
                        "13-linkin_park-numb_(zvukoff.ru).mp3",
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1",
                1024);

        GregorianCalendar dateAfter = new GregorianCalendar();

        writeInfo(new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/" +
                        "13-linkin_park-numb_(zvukoff.ru).mp3"),
                fileForResult,
                dateAfter.getTimeInMillis() - dateBefore.getTimeInMillis(),
                "copy");

        dateBefore = new GregorianCalendar();

        fIleOperations.copy(
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/listOfTeams.txt",
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1",
                1024);

        dateAfter = new GregorianCalendar();

        writeInfo(new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/listOfTeams.txt"),
                fileForResult,
                dateAfter.getTimeInMillis() - dateBefore.getTimeInMillis(),
                "copy");

        System.out.println("\nARCHIVING AND UNARCHIVING:\n");

        dateBefore = new GregorianCalendar();

        fIleOperations.archiving(
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1",
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/",
                "arch1.zip", 1024);

        dateAfter = new GregorianCalendar();

        writeInfo(new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/arch1.zip"),
                fileForResult,
                dateAfter.getTimeInMillis() - dateBefore.getTimeInMillis(),
                "zipping");

        dateBefore = new GregorianCalendar();

        fIleOperations.unArchiving(
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/arch1.zip",
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1",
                1024);

        dateAfter = new GregorianCalendar();

        writeInfo(new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1"),
                fileForResult,
                dateAfter.getTimeInMillis() - dateBefore.getTimeInMillis(),
                "unzipping");

        System.out.println("\nREAD WRITE:\n");

        dateBefore = new GregorianCalendar();

        fIleOperations.readFile("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1/listOfTeams.txt", 1);

        dateAfter = new GregorianCalendar();

        writeInfo(new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1/listOfTeams.txt"),
                fileForResult,
                dateAfter.getTimeInMillis() - dateBefore.getTimeInMillis(),
                "read");

        dateBefore = new GregorianCalendar();

        fIleOperations.writeFile("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1/listOfTeams.txt",
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1/listOfTeams1.txt", 1);

        dateAfter = new GregorianCalendar();

        writeInfo(new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1/listOfTeams1.txt"),
                fileForResult,
                dateAfter.getTimeInMillis() - dateBefore.getTimeInMillis(),
                "write");
    }

    public static void writeInfo(File fileForOperation, File fileForWrite, long sizeOfTimeOperation, String typeOfOperation) {
        try (FileWriter fw = new FileWriter(fileForWrite, true)) {
            StringJoiner result = new StringJoiner("|");
            StringBuilder name = new StringBuilder("\n " + fileForOperation.getName());
            StringBuilder fileSize = new StringBuilder(" " + ((double) fileForOperation.length() / 1000.00) + "Kb");
            StringBuilder modifiedTime = new StringBuilder();
            StringBuilder copyDuration = new StringBuilder(" " + ((double) sizeOfTimeOperation / 1000.00)).append("s");
            StringBuilder operation = new StringBuilder(" " + typeOfOperation);

            while (name.length() < 31) {
                name.append(" ");
            }

            if (name.length() > 31) {
                name = new StringBuilder(name.substring(0, 28).concat("..."));
            }

            while (fileSize.length() < 13) {
                fileSize.append(" ");
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat();
            modifiedTime.append(dateFormat.format(fileForOperation.lastModified()));

            while (modifiedTime.length() < 17) {
                modifiedTime.append(" ");
            }

            while (copyDuration.length() < 17) {
                copyDuration.append(" ");
            }

            while (operation.length() < 16) {
                operation.append(" ");
            }
            result.add(name).add(fileSize).add(modifiedTime).add(copyDuration).add(operation.append("|"));
            fw.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialisationOfFileForResult(File fileForResult){
        try (FileWriter fw = new FileWriter(fileForResult)) {
            String str = "------------------------------+-------------+-----------------+-----------------+-----------------\n" +
                    "  file name                   |  file size  |  modified time  |  copy duration  |  operation     |\n" +
                    "------------------------------+-------------+-----------------+-----------------+-----------------";

            fw.write(str.toCharArray());
        } catch (IOException e) {
            System.out.println("File for result not found");
        }
    }
}
