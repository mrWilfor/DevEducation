package practice.practic_10_15_05_2020;

public class SortByMerge implements IOperations {

    @Override
    public int[] sort(int[] array) {
        int[] array1;
        int[] array2;
        int counterOfArray1 = 0;
        int counterOfArray2 = 0;

        if (array == null || array.length == 0) {
            return null;
        }
        array1 = new int[(array.length + 1) / 2];
        array2 = new int[array.length - array1.length];

        for (int i = 0; i < array.length; i++) {
            if (counterOfArray1 < array1.length) {
                array1[counterOfArray1] = array[i];
                counterOfArray1++;
            } else if (counterOfArray2 < array2.length) {
                array2[counterOfArray2] = array[i];
                counterOfArray2++;
            }
        }
        return merge(array1, array2);
    }

    @Override
    public int[] merge(int[] array1, int[] array2) {
        int[] arrayResult;
        int counterArray1;
        int counterArray2;

        if (array1 == null && array2 != null) {
            return sort(array2);
        } else if (array1 != null && array2 == null) {
            return sort(array1);
        } else if (array1 == null && array2 == null) {
            return null;
        }

        if (array1.length > 1) {
            array1 = sort(array1);
        }

        if (array2.length > 1) {
            array2 = sort(array2);
        }
        arrayResult = new int[array1.length + array2.length];
        counterArray1 = 0;
        counterArray2 = 0;

        for (int i = 0; i < arrayResult.length; i++) {
            if (counterArray1 >= array1.length && counterArray2 < array2.length) {
                if (array2[counterArray2] < arrayResult[i - 1]) {
                    arrayResult[i] = arrayResult[i - 1];
                    arrayResult[i - 1] = array2[counterArray2];
                    counterArray2++;
                } else {
                    arrayResult[i] = array2[counterArray2];
                    counterArray2++;
                }
            } else if (counterArray2 >= array2.length && counterArray1 < array1.length) {
                if (array1[counterArray1] < arrayResult[i - 1]) {
                    arrayResult[i] = arrayResult[i - 1];
                    arrayResult[i - 1] = array1[counterArray1];
                    counterArray1++;
                } else {
                    arrayResult[i] = array1[counterArray1];
                    counterArray1++;
                }
            } else if (array1[counterArray1] <= array2[counterArray2]) {
                arrayResult[i] = array1[counterArray1];
                counterArray1++;
            } else if (array1[counterArray1] > array2[counterArray2]) {
                arrayResult[i] = array2[counterArray2];
                counterArray2++;
            }
        }
        return arrayResult;
    }
}
