package homeWork.hw_6_30_04_2020.part_2;

import java.util.Arrays;

public class DeleteReplicatesOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 4, 5, 1, 5};
        System.out.println(Arrays.toString(deleteRepeatingElements(arr)));
    }

    public static int[] deleteRepeatingElements(int[] array) {
        int[] newArray = new int[array.length];
        int counterNewArray = 0;

        for (int i = 0; i < array.length; i++) {
            int counterRepeating = 0;

            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counterRepeating++;
                }
            }
            if (counterRepeating == 1) {
                newArray[counterNewArray] = array[i];
                counterNewArray++;
            }
        }
        int[] newNewArray = new int[counterNewArray];

        for (int i = 0; i < counterNewArray; i++) {
            newNewArray[i] = newArray[i];
        }
        array = newNewArray;
        return array;
    }
}
