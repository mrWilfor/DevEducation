package homeWork.hw_8_07_05_2020.object.customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void createTest() {
        long expId = 324L;
        String expSurName = "Sidorova";
        String expName = "Dariya";
        String expMiddleName = "Petrovna";
        String expAddress = "Lviv";
        long expNumberOfCreditCard = 1234_5678_9101_1121L;
        long expBankAccountNumber = 748159263L;

        Customer c1 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);

        assertEquals(c1, c2);
        assertEquals(expId, c1.getId());
        assertEquals(expSurName, c1.getSurName());
        assertEquals(expName, c1.getName());
        assertEquals(expMiddleName, c1.getMiddleName());
        assertEquals(expAddress, c1.getAddress());
        assertEquals(expNumberOfCreditCard, c1.getNumberOfCreditCard());
        assertEquals(expBankAccountNumber, c1.getBankAccountNumber());
    }

    @Test
    void setGetTest() {
        Customer c = new Customer();
        long expId = 324L;
        String expSurName = "Sidorova";
        String expName = "Dariya";
        String expMiddleName = "Petrovna";
        String expAddress = "Lviv";
        long expNumberOfCreditCard = 1234_5678_9101_1121L;
        long expBankAccountNumber = 748159263L;

        c.setId(324L);
        c.setSurName("Sidorova");
        c.setName("Dariya");
        c.setMiddleName("Petrovna");
        c.setAddress("Lviv");
        c.setNumberOfCreditCard(1234_5678_9101_1121L);
        c.setBankAccountNumber(748159263L);

        assertEquals(expId, c.getId());
        assertEquals(expSurName, c.getSurName());
        assertEquals(expName, c.getName());
        assertEquals(expMiddleName, c.getMiddleName());
        assertEquals(expAddress, c.getAddress());
        assertEquals(expNumberOfCreditCard, c.getNumberOfCreditCard());
        assertEquals(expBankAccountNumber, c.getBankAccountNumber());
    }

    @Test
    void builderTest() {
        Customer c1 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);

        Customer c2 = new Customer.Builder()
                .id(324L)
                .surName("Sidorova")
                .name("Dariya")
                .middleName("Petrovna")
                .address("Lviv")
                .numberOfCreditCard(1234_5678_9101_1121L)
                .bankAccountNumber(748159263L)
                .build();

        assertEquals(c1, c2);
    }

    @Test
    void testEqualsTest() {
        Customer c1 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);

        assertEquals(c1, c2);
    }

    @Test
    void testEqualsTestFail() {
        Customer c1 = new Customer(324L, "Sidorenko", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);

        assertFalse(c1.equals(c2));
    }

    @Test
    void testHashCodeTest() {
        Customer c1 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);

        assertTrue(c1.hashCode() == c2.hashCode());
    }

    @Test
    void testHashCodeTestFail() {
        Customer c1 = new Customer(324L, "Sidorenko", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);
        Customer c2 = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);

        assertFalse(c1.hashCode() == c2.hashCode());
    }

    @Test
    void testToString() {
        Customer c = new Customer(324L, "Sidorova", "Dariya", "Petrovna", "Lviv",
                1234_5678_9101_1121L, 748159263L);

        String expected = "HomeWork.HW_8_07_05_2020.object.Customer@368119509[id=324, surName=Sidorova, name=Dariya, " +
                "middleName=Petrovna, address=Lviv, numberOfCreditCard=1234567891011121, bankAccountNumber=748159263]";

        assertEquals(c.toString(),expected);
    }
}