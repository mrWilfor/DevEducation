package practice.practic_10_15_05_2020;

public class SortByMin implements IOperations {
    @Override
    public int[] sort(int[] array) {
        boolean trigger;
        int bufferVariable = 0;

        if (array == null || array.length == 0) {
            return null;
        }

        do {
            trigger = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    bufferVariable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bufferVariable;
                    trigger = true;
                }
            }
        } while (trigger);
        return array;
    }

    @Override
    public int[] merge(int[] array1, int[] array2) {
        int[] arrayResult;
        int indexOfArray1 = 0;
        int indexOfArray2 = 0;

        if (array1 == null && array2 != null) {
            return sort(array2);
        } else if (array1 != null && array2 == null) {
            return sort(array1);
        } else if (array1 == null && array2 == null) {
            return null;
        }
        arrayResult = new int[array1.length + array2.length];

        for (int i = 0; i < arrayResult.length; i++)
            if (indexOfArray1 == array1.length) {
                arrayResult[i] = array2[indexOfArray2];
                indexOfArray2++;
            } else {
                arrayResult[i] = array1[indexOfArray1];
                indexOfArray1++;
            }
        return sort(arrayResult);
    }
}
