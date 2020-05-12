package HomeWork.HW_8_07_05_2020.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    @Test
    void createTest() {
        long expId = 261;
        String expSurName = "Sidorova";
        String expName = "Dariya";
        String expMiddleName = "Petrovna";
        String expAddress = "Lviv";
        long expPhoneNumber = 1234567890L;
        long expNumberOfMedicineCard = 564;
        String expDiagnosis = "Healthy";

        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        assertEquals(p1, p2);
        assertEquals(expId, p1.getId());
        assertEquals(expSurName, p1.getSurName());
        assertEquals(expName, p1.getName());
        assertEquals(expMiddleName, p1.getMiddleName());
        assertEquals(expAddress, p1.getAddress());
        assertEquals(expPhoneNumber, p1.getPhoneNumber());
        assertEquals(expNumberOfMedicineCard, p1.getNumberOfMedicineCard());
        assertEquals(expDiagnosis, p1.getDiagnosis());
    }

    @Test
    void setGetTest() {
        Patient p = new Patient();
        long expId = 261;
        String expSurName = "Sidorova";
        String expName = "Dariya";
        String expMiddleName = "Petrovna";
        String expAddress = "Lviv";
        long expPhoneNumber = 1234567890L;
        long expNumberOfMedicineCard = 564;
        String expDiagnosis = "Healthy";

        p.setId(261);
        p.setSurName("Sidorova");
        p.setName("Dariya");
        p.setMiddleName("Petrovna");
        p.setAddress("Lviv");
        p.setPhoneNumber(1234567890L);
        p.setNumberOfMedicineCard(564);
        p.setDiagnosis("Healthy");

        assertEquals(expId, p.getId());
        assertEquals(expSurName, p.getSurName());
        assertEquals(expName, p.getName());
        assertEquals(expMiddleName, p.getMiddleName());
        assertEquals(expAddress, p.getAddress());
        assertEquals(expPhoneNumber, p.getPhoneNumber());
        assertEquals(expNumberOfMedicineCard, p.getNumberOfMedicineCard());
        assertEquals(expDiagnosis, p.getDiagnosis());
    }

    @Test
    void builderTest() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        Patient p2 = new Patient.Builder()
                .id(261)
                .surName("Sidorova")
                .name("Dariya")
                .middleName("Petrovna")
                .address("Lviv")
                .phoneNumber(1234567890L)
                .numberOfMedicineCard(564)
                .diagnosis("Healthy")
                .build();

        assertEquals(p1, p2);
    }

    @Test
    void testEqualsTest() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        assertEquals(p1, p2);
    }

    @Test
    void testEqualsTestFail() {
        Patient p1 = new Patient(0, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        assertFalse(p1.equals(p2));
    }

    @Test
    void testHashCodeTest() {
        Patient p1 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        assertTrue(p1.hashCode() == p2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Patient p1 = new Patient(0, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        Patient p2 = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");

        assertFalse(p1.hashCode() == p2.hashCode());
    }

    @Test
    void testToString() {
        Patient p = new Patient(261, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234567890L, 564, "Healthy");
        String expected = "HomeWork.HW_8_07_05_2020.object.Patient@-1996839321[id=261, surName=Sidorova, name=Dariya, " +
                "middleName=Petrovna, address=Lviv, phoneNumber=1234567890, numberOfMedicineCard=564, diagnosis=Healthy]";

        assertEquals(expected, p.toString());
    }
}