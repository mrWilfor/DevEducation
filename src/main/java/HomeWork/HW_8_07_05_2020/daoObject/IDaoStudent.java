package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Student;

public interface IDaoStudent {
    long create(Student s);

    Student[] readAll();

    Student[] readByFaculty(String name);

    Student[][][] readAllByFacultyAndCourse();

    Student[] readByAfterYear(int year);

    void remove(long id);

    void update(Student s);

    default void clear() {
    }
}
