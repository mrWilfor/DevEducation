package homeWork.hw_8_07_05_2020.object.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void createPerson() {
        long expId = 1L;
        String expFName = "Vasia";
        String expLName = "Pupkin";
        int expAge = 34;
        Person p = new Person(1L, "Vasia", "Pupkin", 34);
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        assertEquals(p, p1);


        assertEquals(expId, p.getId());
        assertEquals(expFName, p.getFirstName());
        assertEquals(expLName, p.getLastName());
        assertEquals(expAge, p.getAge());
    }

    @Test
    public void setGetPerson() {
        Person p = new Person();
        System.out.println("Person id: " + p.getId());
    }

    @Test
    public void buildPerson() {
        Person p =  new Person.Builder()
                .id(1L)
                .firstName("Vasia")
                .lastName("Pupkin")
                .age(34).build();
        Person p1 = new Person(1L, "Vasia", "Pupkin", 34);
        assertEquals(p, p1);
    }

}