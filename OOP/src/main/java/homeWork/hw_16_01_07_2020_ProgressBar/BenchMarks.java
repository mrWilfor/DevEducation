package homeWork.hw_16_01_07_2020_ProgressBar;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.GregorianCalendar;

public class BenchMarks {
    public static void main(String[] args) throws IOException {
        File fileForCopy = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/" +
                "13-linkin_park-numb_(zvukoff.ru).mp3");
        File fileForResult = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/" +
                "copyTest7mb.txt");

        initialisationFileForResult(fileForResult);

        for (int i = 1; i <= 64; i *= 2) {
            benchMark(fileForCopy, fileForResult, i);
        }

        fileForCopy = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/" +
                "java-ee-materials.zip");
        fileForResult = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/copyTest78mb.txt");

        initialisationFileForResult(fileForResult);

        for (int i = 64; i <= 2048; i *= 2) {
            benchMark(fileForCopy, fileForResult, i);
        }

        fileForCopy = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/" +
                "Java EE Lesson 1.mp4");
        fileForResult = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/copyTest267mb.txt");

        initialisationFileForResult(fileForResult);

        for (int i = 128; i <= 4096; i *= 2) {
            benchMark(fileForCopy, fileForResult, i);
        }

        fileForCopy = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/files/" +
                "Java EE Lesson 5.mp4");
        fileForResult = new File("OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/copyTest502mb.txt");

        initialisationFileForResult(fileForResult);

        for (int i = 256; i <= 8192; i *= 2) {
            benchMark(fileForCopy, fileForResult, i);
        }
    }

    public static void benchMark(File fileForCopy, File fileForResult, int sizeOfBuffer) {
        GregorianCalendar dateBefore = new GregorianCalendar();

        copy(fileForCopy.getAbsolutePath(),
                "OOP/src/main/java/homeWork/hw_16_01_07_2020_ProgressBar/1",
                sizeOfBuffer);

        GregorianCalendar dateAfter = new GregorianCalendar();

        writeInfo(fileForCopy.getAbsoluteFile(),
                fileForResult, dateAfter.getTimeInMillis() - dateBefore.getTimeInMillis(), sizeOfBuffer);
    }

    public static void copy(String pathFrom, String pathTo, int sizeOfBuffer) {
        File file = new File(pathFrom);

        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fout = new FileOutputStream(pathTo.concat("\\").concat(file.getName()))) {
            byte[] buffer = new byte[sizeOfBuffer];
            int length;

            while ((length = fis.read(buffer)) != -1) {
                fout.write(buffer, 0, length);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeInfo(File fileForCopy, File fileForWrite, long sizeOfTimeOperation, int sizeOfBuffer) {
        StringBuilder result = new StringBuilder();

        result.append("\n File size:    ")
                .append(new BigDecimal((double) fileForCopy.length() / 1000000)
                        .setScale(2, RoundingMode.HALF_EVEN))
                .append("mb");
        result.append("\n Buffer size:  ").append(sizeOfBuffer).append("b");
        result.append("\n Process time: ").append(new BigDecimal((double) sizeOfTimeOperation / 1000)
                .setScale(2, RoundingMode.HALF_EVEN))
                .append("s\n");

        try (FileWriter fw = new FileWriter(fileForWrite, true)) {
            fw.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialisationFileForResult(File fileForResult) {
        try (FileWriter fw = new FileWriter(fileForResult)) {
            String str = "--------------------------------------------------------------------------------------------------------\n" +
                    "  System characteristics: Intel(R) Core(TM) i3-8145U CPU @ 2.10GHz 2.30 / 8 Gb / SSD\n" +
                    "--------------------------------------------------------------------------------------------------------" +
                    "\n === Copy file ===";

            fw.write(str.toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
