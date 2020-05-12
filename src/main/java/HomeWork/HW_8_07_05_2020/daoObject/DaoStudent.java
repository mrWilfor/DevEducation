package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Student;

public class DaoStudent implements IDaoStudent {
    private static Student[] mock = new Student[0];

    @Override
    public long create(Student s) {
        if (s == null) {
            return -1;
        }
        else if (mock.length == 0) {
            mock = new Student[1];
            mock[0] = s;
        }
        else {
            Student[] newMock = new Student[mock.length + 1];
            for (int i = 0; i < mock.length; i++) {
                newMock[i] = mock[i];
            }
            newMock[newMock.length - 1] = s;
            mock = newMock;
        }
        return s.getId();
    }

    @Override
    public Student[] readAll() {
        return mock;
    }

    @Override
    public Student[] readByFaculty(String name) {
        if (name == null || name == "") {
            return new Student[0];
        }
        Student[] array = new Student[0];
        for (int i = 0; i < mock.length; i++) {
            if (name.equals(mock[i].getName())) {
                if (array.length == 0) {
                    array = new Student[1];
                    array[0] = mock[i];
                }
                else {
                    Student[] newArray = new Student[array.length + 1];
                    for (int j = 0; j < array.length; j++) {
                        newArray[j] = array[j];
                    }
                    newArray[newArray.length - 1] = mock[i];
                    array = newArray;
                }
            }
        }
        return array;
    }

    @Override
    public Student[][][] readAllByFacultyAndCourse() {
        Student[][][] array = new Student[0][0][0];

        return null;
    }

    @Override
    public Student[] readByAfterYear(int year) {

        return null;
    }

    @Override
    public void remove(long id) {
        int index = -1;
        for (int i = 0; i < mock.length; i++) {
            if (id == mock[i].getId()) {
                index = i;
            }
        }
        if (index != -1) {
            Student[] array = new Student[mock.length - 1];
            for (int i = 0; i < index; i++) {
                array[i] = mock[i];
            }
            for (int i = index + 1; i < mock.length; i++) {
                array[i - 1] = mock[i];
            }
            mock = array;
        }

    }

    @Override
    public void update(Student s) {

    }

    @Override
    public void clear() {
        mock = new Student[0];
    }
}
/*
public class DaoStudent {
    public static void main(String[] args) {
        Student[] array = new Student[1];
        Student s1 = new Student.Builder()
                .id(124)
                .surName("Petrov")
                .name("Petr")
                .middleName("Petrovich")
                .dateOfBirth(22011996)
                .addressOfResidence("Kiev, place freedom, home 15")
                .phoneNumber(3034450L)
                .faculty("gumanitariy")
                .course(2)
                .group("12G")
                .build();

        Student s2 = new Student.Builder()
                .id(124)
                .surName("Ivanov")
                .name("Alex")
                .middleName("Petrovich")
                .dateOfBirth(24021992)
                .addressOfResidence("Kiev, place freedom, home 16")
                .phoneNumber(7674450L)
                .faculty("gumanitariy")
                .course(1)
                .group("12G")
                .build();

        Student s3 = new Student.Builder()
                .id(124)
                .surName("Ivanov")
                .name("Dmitriy")
                .middleName("Ivanovich")
                .dateOfBirth(5098879)
                .addressOfResidence("Kiev, place freedom, home 18")
                .phoneNumber(12234450L)
                .faculty("technical")
                .course(3)
                .group("12T")
                .build();

        Student s4 = new Student.Builder()
                .id(124)
                .surName("Tarasov")
                .name("Ivan")
                .middleName("Alexandrovich")
                .dateOfBirth(22021996)
                .addressOfResidence("Dnepr, Lazaryana 2")
                .phoneNumber(303564450L)
                .faculty("technical")
                .course(1)
                .group("12T")
                .build();

        Student s5 = new Student.Builder()
                .id(124)
                .surName("Karenina")
                .name("Anna")
                .middleName("Sergeevna")
                .dateOfBirth(22011996)
                .addressOfResidence("Dnepr, Gagarina 15")
                .phoneNumber(303564450L)
                .faculty("gumanitariy")
                .course(2)
                .group("12G")
                .build();

        array = buildArray(s1, array);
        array = buildArray(s2, array);
        array = buildArray(s3, array);
        array = buildArray(s4, array);
        array = buildArray(s5, array);


 */
