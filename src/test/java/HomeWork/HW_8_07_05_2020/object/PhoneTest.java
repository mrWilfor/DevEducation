package HomeWork.HW_8_07_05_2020.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void createTest() {
        long expId = 7395739L;
        String expSurName = "Votchenko";
        String expName = "Diana";
        String expMiddleName = "Sergeevna";
        String expAddress = "Dnepr";
        long expNumberOfCreditCard = 3857_6394_3545_6576L;
        long expDebit = 12;
        long expCredit = 10;
        long expTalkTime = 5600;

        Phone p1 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p2 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        assertEquals(p1, p2);
        assertEquals(expId, p1.getId());
        assertEquals(expSurName, p1.getSurName());
        assertEquals(expName, p1.getName());
        assertEquals(expMiddleName, p1.getMiddleName());
        assertEquals(expAddress, p1.getAddress());
        assertEquals(expNumberOfCreditCard, p1.getNumberOfCreditCard());
        assertEquals(expDebit, p1.getDebit());
        assertEquals(expCredit, p1.getCredit());
        assertEquals(expTalkTime, p1.getTalkTime());
    }

    @Test
    void setGetTest() {
        Phone p = new Phone();
        long expId = 7395739L;
        String expSurName = "Votchenko";
        String expName = "Diana";
        String expMiddleName = "Sergeevna";
        String expAddress = "Dnepr";
        long expNumberOfCreditCard = 3857_6394_3545_6576L;
        long expDebit = 12;
        long expCredit = 10;
        long expTalkTime = 5600;

        p.setId(7395739L);
        p.setSurName("Votchenko");
        p.setName("Diana");
        p.setMiddleName("Sergeevna");
        p.setAddress("Dnepr");
        p.setNumberOfCreditCard(3857_6394_3545_6576L);
        p.setDebit(12);
        p.setCredit(10);
        p.setTalkTime(5600);

        assertEquals(expId, p.getId());
        assertEquals(expSurName, p.getSurName());
        assertEquals(expName, p.getName());
        assertEquals(expMiddleName, p.getMiddleName());
        assertEquals(expAddress, p.getAddress());
        assertEquals(expNumberOfCreditCard, p.getNumberOfCreditCard());
        assertEquals(expDebit, p.getDebit());
        assertEquals(expCredit, p.getCredit());
        assertEquals(expTalkTime, p.getTalkTime());
    }

    @Test
    void builderTest() {
        Phone p1 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        Phone p2 = new Phone.Builder()
                .id(7395739L)
                .surName("Votchenko")
                .name("Diana")
                .middleName("Sergeevna")
                .address("Dnepr")
                .numberOfCreditCard(3857_6394_3545_6576L)
                .debit(12)
                .credit(10)
                .talkTime(5600)
                .build();

        assertEquals(p1, p2);
    }

    @Test
    void testEqualsTest() {
        Phone p1 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p2 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        assertEquals(p1, p2);
    }

    @Test
    void testEqualsTestFail() {
        Phone p1 = new Phone(7395739L, "Votchenko", "Inna", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p2 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        assertFalse(p1.equals(p2));
    }

    @Test
    void testHashCodeTest() {
        Phone p1 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p2 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        assertTrue(p1.hashCode() == p2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Phone p1 = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        Phone p2 = new Phone(7395739L, "Votchenko", "Inna", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);

        assertFalse(p1.hashCode() == p2.hashCode());
    }

    @Test
    void testToString() {
        Phone p = new Phone(7395739L, "Votchenko", "Diana", "Sergeevna", "Dnepr",
                3857_6394_3545_6576L, 12, 10, 5600);
        String expected = "HomeWork.HW_8_07_05_2020.object.Phone@-1801507402[id=7395739, surName=Votchenko, name=Diana, " +
                "middleName=Sergeevna, address=Dnepr, numberOfCreditCard=3857639435456576, debit=12, credit=10, talkTime=5600]";

        assertEquals(expected, p.toString());
    }
}