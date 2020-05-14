package homeWork.hw_8_07_05_2020.object.abiturient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbiturientTest {

    @Test
    void createAbiturientTest() {
        long expId = 324L;
        String expSurName = "Sidorova";
        String expName = "Dariya";
        String expMiddleName = "Petrovna";
        String expAddress = "Lviv";
        long expPhoneNumber = 1234567890L;
        int[] expAssessments = {5, 4, 3, 4};

        Abiturient a1 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});
        Abiturient a2 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});

        assertEquals(a1, a2);
        assertEquals(expId, a1.getId());
        assertEquals(expSurName, a1.getSurName());
        assertEquals(expName, a1.getName());
        assertEquals(expMiddleName, a1.getMiddleName());
        assertEquals(expAddress, a1.getAddress());
        assertEquals(expPhoneNumber, a1.getPhoneNumber());
        assertArrayEquals(expAssessments, a1.getAssessments());
    }

    @Test
    void setGetAbiturientTest() {
        Abiturient a = new Abiturient();
        long expId = 324L;
        String expSurName = "Sidorova";
        String expName = "Dariya";
        String expMiddleName = "Petrovna";
        String expAddress = "Lviv";
        long expPhoneNumber = 1234567890L;
        int[] expAssessments = {5, 4, 3, 4};

        a.setId(324L);
        a.setSurName("Sidorova");
        a.setName("Dariya");
        a.setMiddleName("Petrovna");
        a.setAddress("Lviv");
        a.setPhoneNumber(1234567890L);
        a.setAssessments(new int[]{5, 4, 3, 4});

        assertEquals(expId, a.getId());
        assertEquals(expSurName, a.getSurName());
        assertEquals(expName, a.getName());
        assertEquals(expMiddleName, a.getMiddleName());
        assertEquals(expAddress, a.getAddress());
        assertEquals(expPhoneNumber, a.getPhoneNumber());
        assertArrayEquals(expAssessments, a.getAssessments());
    }

    @Test
    void builderAbiturientTest() {
        Abiturient a1 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});

        Abiturient a2 = new Abiturient.Builder()
                .id(324L)
                .surName("Sidorova")
                .name("Dariya")
                .middleName("Petrovna")
                .address("Lviv")
                .phoneNumber(1234567890L)
                .assessments(new int[]{5, 4, 3, 4})
                .build();

        assertTrue(a1.equals(a2));
    }

    @Test
    void testEqualsTest() {
        Abiturient a1 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});
        Abiturient a2 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});

        assertTrue(a1.equals(a2));
    }

    @Test
    void testEqualsTestFail() {
        Abiturient a1 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});
        Abiturient a2 = new Abiturient(324L, "Sidorova", "Maria", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});

        assertFalse(a1.equals(a2));
    }

    @Test
    void testHashCodeTest() {
        Abiturient a1 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});
        Abiturient a2 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});

        assertTrue(a1.hashCode() == a2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Abiturient a1 = new Abiturient(324L, "Sidorova", "Maria", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});
        Abiturient a2 = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});
        System.out.println(a2.hashCode());
        assertFalse(a1.hashCode() == a2.hashCode());
    }

    @Test
    void testToString() {
        Abiturient a = new Abiturient(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, new int[]{5, 4, 3, 4});

        String expected = "HomeWork.HW_8_07_05_2020.object.Abiturient@-161007848[id=324, surName=Sidorova, name=Dariya, " +
                "middleName=Petrovna, address=Lviv, phoneNumber=1234567890, assessments=[5, 4, 3, 4]]";

        assertEquals(expected, a.toString());
    }
}