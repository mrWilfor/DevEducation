package homeWork.hw_13_22_06_2020_Read_Write;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class ReadWriteTextFileImpl implements ReadWriteTextFile {
    @Override
    public void readSortByLengthWrite(String pathFrom, String pathTo, SequenceComparable direction) throws FileNotFoundException {
        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("file not found");
        }

        try (FileReader fr = new FileReader(pathFrom);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(pathTo)) {
            List<String> listForSort = new ArrayList<>();
            StringJoiner stringResult = new StringJoiner("\n");
            String bufferString;

            while ((bufferString = br.readLine()) != null) {
                listForSort.add(bufferString);
            }

            compareStringByLength(listForSort, direction);
            Stream.iterate(0, x -> x + 1)
                    .limit(listForSort.size())
                    .forEach(x -> stringResult.add(listForSort.get(x)));
            fw.write(stringResult.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void divisionTextByFileByFirstChar(String pathFrom, String pathTo,
                                              SequenceComparable direction) throws FileNotFoundException {
        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("file not found");
        }

        try (FileReader fr = new FileReader(pathFrom);
             BufferedReader br = new BufferedReader(fr)) {
            List<String> listForSort = new ArrayList<>();
            String bufferString;

            while ((bufferString = br.readLine()) != null) {
                String[] bufferArrayStrings = bufferString.replaceAll("[.,!?]", "").split(" ");

                listForSort.addAll(Arrays.asList(bufferArrayStrings));
            }

            compareStringByFirstChar(listForSort, direction);

            listForSort.stream().map(word -> word.toLowerCase().charAt(0))
                    .distinct()
                    .forEach(firstChar -> {
                        File file = new File(pathTo + firstChar + ".txt");

                        try (FileWriter fw = new FileWriter(file)) {
                            List<String> listForSortByLength = new ArrayList<>();
                            StringJoiner stringResult = new StringJoiner(" ");

                            listForSort.stream().filter(word -> firstChar == word.toLowerCase().charAt(0))
                                    .forEach(listForSortByLength::add);

                            compareStringByLength(listForSortByLength, direction);

                            listForSortByLength.forEach(stringResult::add);
                            fw.write(stringResult.toString());
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void copyFewFiles(String pathFrom, String pathTo) {
        File[] files = new File(pathFrom).listFiles();
        Queue<Integer> names = new LinkedList<>();

        assert files != null;
        Stream.generate(() -> (int) (Math.random() * (files.length) + 1))
                .distinct()
                .limit(files.length)
                .forEach(names::add);

        Stream.of(files)
                .forEach(file -> {
                    File copyFile = new File(pathTo + names.poll() + ".txt");

                    try (FileInputStream fileInputStream = new FileInputStream(file);
                         FileOutputStream fileOutputStream = new FileOutputStream(copyFile)) {
                        byte[] bufferArray = new byte[fileInputStream.available()];

                        fileInputStream.read(bufferArray, 0, bufferArray.length);
                        fileOutputStream.write(bufferArray, 0, bufferArray.length);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

    @Override
    public void compareStringByLength(List<String> listForSort, SequenceComparable direction) {
        if (direction == SequenceComparable.ASC) {
            listForSort.sort((x, y) -> Integer.compare(x.length(), y.length()));
        } else if (direction == SequenceComparable.DSC) {
            listForSort.sort((x, y) -> Integer.compare(y.length(), x.length()));
        }
    }

    @Override
    public void compareStringByFirstChar(List<String> listForSort, SequenceComparable direction) {
        if (direction == SequenceComparable.ASC) {
            listForSort.sort((x, y) -> x.compareTo(y));
        } else if (direction == SequenceComparable.DSC) {
            listForSort.sort((x, y) -> y.compareTo(x));
        }
    }
}
