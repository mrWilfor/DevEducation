package homeWork.hw_13_22_06_2020_Read_Write;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String result;

        ReadWriteTextFile.serializing(
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/FirstTxtFile.txt",
                "how\n do\n you\n do");

        result = ReadWriteTextFile.deSerializing(
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/FirstTxtFile.txt");

        System.out.println();
        System.out.println(result);

        ReadWriteTextFile.readSortByLengthWrite(
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/FirstTxtFile.txt",
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/FirstTxtFileNew.txt",
                SequenceComparable.DSC);

        result = ReadWriteTextFile.deSerializing(
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/FirstTxtFileNew.txt");

        System.out.println();
        System.out.println(result);

        ReadWriteTextFile.divisionTextByFileByFirstChar(
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/FirstTxtFile.txt",
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/divisionText/", " ",
                SequenceComparable.ASC);

        ReadWriteTextFile.copyFewFiles("OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/",
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/divisionText/d.txt",
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/divisionText/h.txt",
                "OOP/src/main/java/homeWork/hw_13_22_06_2020_Read_Write/txtFile/divisionText/y.txt");
    }
}
