package homeWork.hw_8_07_05_2020.object.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void createStudentTest() {
        long expId = 14;
        String expSurName = "Ilyin";
        String expName = "Dima";
        String expMiddleName = "Petrovich";
        int expDateOfBirth = 31_12_1970;
        String expAddressOfResidence = "Uzhgorod";
        long expPhoneNumber = 1234567890;
        String expFaculty = "Bridges";
        int expCourse = 3;
        String expGroup = "3B";
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        assertEquals(s1, s2, "Test failed");
        assertEquals(expId, s1.getId());
        assertEquals(expSurName, s1.getSurName());
        assertEquals(expName, s1.getName());
        assertEquals(expMiddleName, s1.getMiddleName());
        assertEquals(expDateOfBirth, s1.getDateOfBirth());
        assertEquals(expAddressOfResidence, s1.getAddressOfResidence());
        assertEquals(expPhoneNumber, s1.getPhoneNumber());
        assertEquals(expFaculty, s1.getFaculty());
        assertEquals(expCourse, s1.getCourse());
        assertEquals(expGroup, s1.getGroup());
    }

    @Test
    void setGetStudentTest() {
        Student s = new Student();
        long expId = 14;
        String expSurName = "Ilyin";
        String expName = "Dima";
        String expMiddleName = "Petrovich";
        int expDateOfBirth = 31_12_1970;
        String expAddressOfResidence = "Uzhgorod";
        long expPhoneNumber = 1234567890;
        String expFaculty = "Bridges";
        int expCourse = 3;
        String expGroup = "3B";

        s.setId(14);
        s.setSurName("Ilyin");
        s.setName("Dima");
        s.setMiddleName("Petrovich");
        s.setDateOfBirth(31121970);
        s.setAddressOfResidence("Uzhgorod");
        s.setPhoneNumber(1234567890);
        s.setFaculty("Bridges");
        s.setCourse(3);
        s.setGroup("3B");

        assertEquals(expId, s.getId());
        assertEquals(expSurName, s.getSurName());
        assertEquals(expName, s.getName());
        assertEquals(expMiddleName, s.getMiddleName());
        assertEquals(expDateOfBirth, s.getDateOfBirth());
        assertEquals(expAddressOfResidence, s.getAddressOfResidence());
        assertEquals(expPhoneNumber, s.getPhoneNumber());
        assertEquals(expFaculty, s.getFaculty());
        assertEquals(expCourse, s.getCourse());
        assertEquals(expGroup, s.getGroup());
    }

    @Test
    void builderStudentTest() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        Student s2 = new Student.Builder()
                .id(14)
                .surName("Ilyin")
                .name("Dima")
                .middleName("Petrovich")
                .dateOfBirth(31121970)
                .addressOfResidence("Uzhgorod")
                .phoneNumber(1234567890)
                .faculty("Bridges")
                .course(3)
                .group("3B")
                .build();

        assertEquals(s1, s2, "Test failed");
    }

    @Test
    void testEqualsTest() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        assertTrue(s1.equals(s2));
    }

    @Test
    void testEqualsTestFail() {
        Student s1 = new Student(10, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        assertFalse(s1.equals(s2));
    }

    @Test
    void testHashCodeTest() {
        Student s1 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        assertTrue(s1.hashCode() == s2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Student s1 = new Student(10, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");
        Student s2 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        assertTrue(s1.hashCode() != s2.hashCode());
    }

    @Test
    void testToString() {
        Student s2 = new Student(14, "Ilyin", "Dima", "Petrovich", 31_12_1970,
                "Uzhgorod", 1234567890, "Bridges", 3, "3B");

        String expected = "HomeWork.HW_8_07_05_2020.object.Student@954161814[id=14, surName=Ilyin, name=Dima, middleName=Petrovich, " +
                "dateOfBirth=31121970, addressOfResidence=Uzhgorod, phoneNumber=1234567890, faculty=Bridges, course=3, group=3B]";

        assertEquals(s2.toString(),expected);
    }
}