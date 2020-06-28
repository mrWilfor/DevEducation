package homeWork.hw_13_22_06_2020_Read_Write;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class ReadWriteTextFileImpl implements ReadWriteTextFile {
    @Override
    public void readSortByLengthWrite(String pathFrom, String pathTo, SequenceComparable sc) throws FileNotFoundException {
        String bufferString;
        List<String> listForSort = new ArrayList<>();
        StringJoiner stringResult = new StringJoiner("\n");

        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("file not found");
        }

        try (FileReader fr = new FileReader(pathFrom);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(pathTo)) {

            while ((bufferString = br.readLine()) != null) {
                listForSort.add(bufferString);
            }

            compareStringByLength(listForSort, sc);
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
                                              SequenceComparable sc) throws FileNotFoundException {
        String bufferString;
        List<String> listForSort = new ArrayList<>();

        if (!new File(pathFrom).isFile()) {
            throw new FileNotFoundException("file not found");
        }

        try (FileReader fr = new FileReader(pathFrom);
             BufferedReader br = new BufferedReader(fr)) {

            while ((bufferString = br.readLine()) != null) {
                String[] bufferArrayStrings = bufferString.replaceAll("[.,!?]", "").split(" ");

                listForSort.addAll(Arrays.asList(bufferArrayStrings));
            }

            compareStringByFirstChar(listForSort, sc);

            listForSort.stream().map(x -> x.toLowerCase().charAt(0))
                    .distinct()
                    .forEach(x -> {
                        File file = new File(pathTo + x + ".txt");

                        try (FileWriter fw = new FileWriter(file)) {
                            List<String> listForSortByLength = new ArrayList<>();
                            StringJoiner stringResult = new StringJoiner(" ");

                            listForSort.stream().filter(y -> x == y.toLowerCase().charAt(0))
                                    .forEach(listForSortByLength::add);

                            compareStringByLength(listForSortByLength, sc);

                            listForSortByLength.stream().forEach(stringResult::add);

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

        Stream.generate(() -> (int) (Math.random() * (files.length + 1) + 1))
                .distinct()
                .limit(files.length)
                .forEach(names::add);

        Stream.of(files)
                .forEach(x -> {
                    File copyFile = new File(pathTo + names.poll() + ".txt");
                    try (FileInputStream fileInputStream = new FileInputStream(x);
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
    public void compareStringByLength(List<String> listForSort, SequenceComparable sc) {
        if (sc == SequenceComparable.ASC) {
            listForSort.sort((x, y) -> Integer.compare(x.length(), y.length()));
        } else if (sc == SequenceComparable.DSC) {
            listForSort.sort((x, y) -> Integer.compare(y.length(), x.length()));
        }
    }

    @Override
    public void compareStringByFirstChar(List<String> listForSort, SequenceComparable sc) {
        if (sc == SequenceComparable.ASC) {
            listForSort.sort((x, y) -> x.compareTo(y));
        } else if (sc == SequenceComparable.DSC) {
            listForSort.sort((x, y) -> y.compareTo(x));
        }
    }

    @Override
    public String readFile(String pathFrom) throws FileNotFoundException {
        File txtFile = new File(pathFrom);
        StringJoiner result = new StringJoiner("\n");

        try (FileReader fr = new FileReader(txtFile); BufferedReader reader = new BufferedReader(fr)) {
            String bufferString;

            while ((bufferString = reader.readLine()) != null) {
                result.add(bufferString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
