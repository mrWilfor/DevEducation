package homeWork.hw_8_07_05_2020.object.abiturient;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DaoAbiturient implements IDaoAbiturient {
    private static Abiturient[] listOfAbiturients = new Abiturient[0];

    @Override
    public long create(Abiturient abiturient) {
        if (abiturient == null) {
            return -1;
        } else if (listOfAbiturients.length == 0) {
            listOfAbiturients = new Abiturient[1];
            listOfAbiturients[0] = abiturient;
        } else {
            Abiturient[] arrayOfAbiturients = new Abiturient[listOfAbiturients.length + 1];

            for (int i = 0; i < listOfAbiturients.length; i++) {
                arrayOfAbiturients[i] = listOfAbiturients[i];
            }
            arrayOfAbiturients[arrayOfAbiturients.length - 1] = abiturient;
            listOfAbiturients = arrayOfAbiturients;
        }
        return abiturient.getId();
    }

    @Override
    public Abiturient[] readAll() {
        return listOfAbiturients;
    }

    @Override
    public Abiturient[] readByPoorGrades() {
        Abiturient[] arrayOfAbiturients = new Abiturient[0];

        for (int i = 0; i < listOfAbiturients.length; i++) {
            for (int mark : listOfAbiturients[i].getAssessments()) {
                if (mark < 3) {
                    if (arrayOfAbiturients.length == 0) {
                        arrayOfAbiturients = new Abiturient[1];
                        arrayOfAbiturients[0] = listOfAbiturients[i];
                    } else {
                        Abiturient[] newArrayOfAbiturients = new Abiturient[arrayOfAbiturients.length + 1];

                        for (int j = 0; j < arrayOfAbiturients.length; j++) {
                            newArrayOfAbiturients[j] = arrayOfAbiturients[j];
                        }
                        newArrayOfAbiturients[newArrayOfAbiturients.length - 1] = listOfAbiturients[i];
                        arrayOfAbiturients = newArrayOfAbiturients;
                    }
                    break;
                }
            }
        }
        return arrayOfAbiturients;
    }

    @Override
    public Abiturient[] readByAverageMarkHigherGiven(double averageMark) {
        Abiturient[] arrayOfAbiturients = new Abiturient[0];

        if (averageMark == 0) {
            return new Abiturient[0];
        }

        for (int i = 0; i < listOfAbiturients.length; i++) {
            if (averageMark < averageMark(listOfAbiturients[i])) {
                if (arrayOfAbiturients.length == 0) {
                    arrayOfAbiturients = new Abiturient[1];
                    arrayOfAbiturients[0] = listOfAbiturients[i];
                } else {
                    Abiturient[] newArrayOfAbiturients = new Abiturient[arrayOfAbiturients.length + 1];

                    for (int j = 0; j < arrayOfAbiturients.length; j++) {
                        newArrayOfAbiturients[j] = arrayOfAbiturients[j];
                    }
                    newArrayOfAbiturients[newArrayOfAbiturients.length - 1] = listOfAbiturients[i];
                    arrayOfAbiturients = newArrayOfAbiturients;
                }
            }
        }
        return arrayOfAbiturients;
    }

    @Override
    public Abiturient[] readByHighestAverageMark(int quantityOfAbiturients) {
        Abiturient[] arrayOfAbiturients = new Abiturient[listOfAbiturients.length];
        Abiturient[] resultArray = new Abiturient[quantityOfAbiturients];
        boolean trigger;
        Abiturient bufferObject;

        for (int i = 0; i < listOfAbiturients.length; i++) {
            arrayOfAbiturients[i] = listOfAbiturients[i];
        }

        do {
            trigger = false;

            for (int i = 0; i < arrayOfAbiturients.length - 1; i++) {
                if (averageMark(arrayOfAbiturients[i]) < averageMark(arrayOfAbiturients[i + 1])) {
                    bufferObject = arrayOfAbiturients[i];
                    arrayOfAbiturients[i] = arrayOfAbiturients[i + 1];
                    arrayOfAbiturients[i + 1] = bufferObject;
                    trigger = true;
                }
            }
        } while (trigger);

        for (int i = 0; i < quantityOfAbiturients; i++) {
            resultArray[i] = arrayOfAbiturients[i];
        }
        return resultArray;
    }

    public double averageMark(Abiturient abiturient) {
        double sum = 0.0;
        int quantity = 0;
        double result = 0.0;
        int[] markOfAbiturient = abiturient.getAssessments();

        for (int j : markOfAbiturient) {
            sum += j;
            quantity++;
        }
        result = new BigDecimal(sum / quantity).
                setScale(1, RoundingMode.HALF_EVEN).doubleValue();
        return result;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfAbiturients.length; i++) {
            if (id == listOfAbiturients[i].getId()) {
                index = i;
            }
        }
        if (index != -1) {
            Abiturient[] arrayOfAbiturients = new Abiturient[listOfAbiturients.length - 1];

            for (int i = 0; i < index; i++) {
                arrayOfAbiturients[i] = listOfAbiturients[i];
            }

            for (int i = index + 1; i < listOfAbiturients.length; i++) {
                arrayOfAbiturients[i - 1] = listOfAbiturients[i];
            }
            listOfAbiturients = arrayOfAbiturients;
        }
    }

    @Override
    public void update(Abiturient abiturient) {
        for (int i = 0; i < listOfAbiturients.length; i++) {
            if (abiturient.getId() == listOfAbiturients[i].getId()) {
                listOfAbiturients[i] = abiturient;
            }
        }
    }

    @Override
    public void clear() {
        listOfAbiturients = new Abiturient[0];
    }
}
