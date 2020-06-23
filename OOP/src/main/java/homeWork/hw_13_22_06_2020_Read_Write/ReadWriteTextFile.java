package homeWork.hw_13_22_06_2020_Read_Write;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class ReadWriteTextFile {
    public static void readSortByLengthWrite(String fileFrom, String fileTo, SequenceComparable sc)
            throws IOException, ClassNotFoundException {
        String bufferString;
        String[] arrayForSort;

        bufferString = deSerializing(fileFrom);

        arrayForSort = bufferString.replaceAll(" ", "").split("\n");

        compareStringByLength(arrayForSort, sc);

        serializing(fileTo, String.join("\n", arrayForSort));
    }

    public static void divisionTextByFileByFirstChar(String fileFrom, String destination, String separator,
                                                     SequenceComparable sc) throws IOException {
        String bufferString;
        String[] arrayForSort;

        bufferString = deSerializing(fileFrom);
        arrayForSort = bufferString.replaceAll("[.,\\n]", "").split(separator);

        compareStringByFirstChar(arrayForSort, sc);

        Arrays.stream(arrayForSort)
                .map(x -> x.toLowerCase().charAt(0))
                .distinct()
                .forEach(x -> {
                    try {
                        serializing(destination + x + ".txt",
                                Arrays.stream(arrayForSort)
                                        .filter(y -> x == y.toLowerCase().charAt(0))
                                        .reduce("\n", (f, i) -> f + " " + i));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

    public static void copyFewFiles(String destination, String... fileNames) {
        Queue<Integer> names = new LinkedList<>();

        Stream.generate(() -> (int) (Math.random() * (fileNames.length + 1) + 1))
                .distinct()
                .limit(fileNames.length)
                .forEach(names::add);

        Arrays.stream(fileNames)
                .forEach(x -> {
                    try {
                        serializing(destination + names.poll() + ".txt", deSerializing(x));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

    public static void serializing(String fileName, String fileValue) throws IOException {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeUTF(fileValue);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in %s", fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String deSerializing(String fileName) throws IOException {
        String result = null;

        try {
            FileInputStream fileInput = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileInput);
            result = in.readUTF();
            in.close();
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void compareStringByLength(String[] arrayForSort, SequenceComparable sc) {
        if (sc == SequenceComparable.ASC) {
            Arrays.sort(arrayForSort, (x, y) -> Integer.compare(x.length(), y.length()));
        } else if (sc == SequenceComparable.DSC) {
            Arrays.sort(arrayForSort, (x, y) -> Integer.compare(y.length(), x.length()));
        }
    }

    public static void compareStringByFirstChar(String[] arrayForSort, SequenceComparable sc) {
        if (sc == SequenceComparable.ASC) {
            Arrays.sort(arrayForSort, (x, y) -> x.compareTo(y));
        } else if (sc == SequenceComparable.DSC) {
            Arrays.sort(arrayForSort, (x, y) -> y.compareTo(x));
        }
    }
}
