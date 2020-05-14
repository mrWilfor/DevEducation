package homeWork.hw_8_07_05_2020.object.abiturient;

public interface IDaoAbiturient {
    long create(Abiturient abiturient);

    Abiturient[] readAll();

    Abiturient[] readByPoorGrades();

    Abiturient[] readByAverageMarkHigherGiven(double averageMark);

    Abiturient[] readByHighestAverageMark(int quantityOfAbiturients);

    void remove(long id);

    void update(Abiturient abiturient);

    default void clear() {

    }
}
