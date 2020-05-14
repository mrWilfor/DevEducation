package homeWork.hw_8_07_05_2020.object.student;

public interface IDaoStudent {
    long create(Student s);

    Student[] readAll();

    Student[] readByFaculty(String faculty);

    Student[] readAllByFacultyAndCourse(String faculty, int course);

    Student[] readByAfterYear(int year);

    void remove(long id);

    void update(Student s);

    default void clear() {
    }
}
