package homeWork.hw_8_07_05_2020.object.student;

public class DaoStudent implements IDaoStudent {
    private static Student[] listOfStudent = new Student[0];

    @Override
    public long create(Student student) {
        if (student == null) {
            return -1;
        } else if (listOfStudent.length == 0) {
            listOfStudent = new Student[1];
            listOfStudent[0] = student;
        } else {
            Student[] arrayOfStudent = new Student[listOfStudent.length + 1];

            for (int i = 0; i < listOfStudent.length; i++) {
                arrayOfStudent[i] = listOfStudent[i];
            }
            arrayOfStudent[arrayOfStudent.length - 1] = student;
            listOfStudent = arrayOfStudent;
        }
        return student.getId();
    }

    @Override
    public Student[] readAll() {
        return listOfStudent;
    }

    @Override
    public Student[] readByFaculty(String faculty) {
        Student[] arrayOfStudent = new Student[0];

        if (faculty == null || faculty == "") {
            return new Student[0];
        }

        for (int i = 0; i < listOfStudent.length; i++) {
            if (faculty.equals(listOfStudent[i].getFaculty())) {
                if (arrayOfStudent.length == 0) {
                    arrayOfStudent = new Student[1];
                    arrayOfStudent[0] = listOfStudent[i];
                } else {
                    Student[] newArray = new Student[arrayOfStudent.length + 1];

                    for (int j = 0; j < arrayOfStudent.length; j++) {
                        newArray[j] = arrayOfStudent[j];
                    }
                    newArray[newArray.length - 1] = listOfStudent[i];
                    arrayOfStudent = newArray;
                }
            }
        }
        return arrayOfStudent;
    }

    @Override
    public Student[] readAllByFacultyAndCourse(String faculty, int course) {
        Student[] arrayOfStudent = new Student[0];

        if ((faculty == null || faculty == "") || course == 0) {
            return new Student[0];
        }

        for (int i = 0; i < listOfStudent.length; i++) {
            if (faculty.equals(listOfStudent[i].getFaculty()) && course == listOfStudent[i].getCourse()) {
                if (arrayOfStudent.length == 0) {
                    arrayOfStudent = new Student[1];
                    arrayOfStudent[0] = listOfStudent[i];
                } else {
                    Student[] newArray = new Student[arrayOfStudent.length + 1];

                    for (int j = 0; j < arrayOfStudent.length; j++) {
                        newArray[j] = arrayOfStudent[j];
                    }
                    newArray[newArray.length - 1] = listOfStudent[i];
                    arrayOfStudent = newArray;
                }
            }
        }
        return arrayOfStudent;
    }

    @Override
    public Student[] readByAfterYear(int year) {
        Student[] arrayOfStudent = new Student[0];

        if (year == 0) {
            return new Student[0];
        }

        for (int i = 0; i < listOfStudent.length; i++) {
            if (year < listOfStudent[i].getDateOfBirth() % 10000) {
                if (arrayOfStudent.length == 0) {
                    arrayOfStudent = new Student[1];
                    arrayOfStudent[0] = listOfStudent[i];
                } else {
                    Student[] newArrayOfStudent = new Student[arrayOfStudent.length + 1];

                    for (int j = 0; j < arrayOfStudent.length; j++) {
                        newArrayOfStudent[j] = arrayOfStudent[j];
                    }
                    newArrayOfStudent[newArrayOfStudent.length - 1] = listOfStudent[i];
                    arrayOfStudent = newArrayOfStudent;
                }
            }
        }
        return arrayOfStudent;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfStudent.length; i++) {
            if (id == listOfStudent[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            Student[] arrayOfStudent = new Student[listOfStudent.length - 1];

            for (int i = 0; i < index; i++) {
                arrayOfStudent[i] = listOfStudent[i];
            }

            for (int i = index + 1; i < listOfStudent.length; i++) {
                arrayOfStudent[i - 1] = listOfStudent[i];
            }
            listOfStudent = arrayOfStudent;
        }
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < listOfStudent.length; i++) {
            if (student.getId() == listOfStudent[i].getId()) {
                listOfStudent[i] = student;
            }
        }
    }

    @Override
    public void clear() {
        listOfStudent = new Student[0];
    }
}
