package homeWork.hw_8_Parth_3_19_05_2020.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SportsEquipmentTest {

    @Test
    void equals() {
        SportsEquipment sportsEquipment = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        SportsEquipment sportsEquipment2 = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",

                100
        );

        assertTrue(sportsEquipment.equals(sportsEquipment2));
    }

    @Test
    void equalsFail() {
        SportsEquipment sportsEquipment = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        SportsEquipment sportsEquipment2 = new SportsEquipment(
                "Dumbbell",
                "red",
                "dumbbell for power loads",
                100
        );

        assertFalse(sportsEquipment.equals(sportsEquipment2));
    }

    @Test
    void hashCodeTrue() {
        SportsEquipment sportsEquipment = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        SportsEquipment sportsEquipment2 = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );

        assertEquals(sportsEquipment.hashCode(), sportsEquipment2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        SportsEquipment sportsEquipment = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        SportsEquipment sportsEquipment2 = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                150
        );

        assertNotEquals(sportsEquipment.hashCode(), sportsEquipment2.hashCode());
    }

    @Test
    void toStringTrue() {
        SportsEquipment sportsEquipment = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100
        );
        String expected = "SportsEquipment{nameOfProduct='Dumbbell', category='Equipment', color='black', " +
                "description='dumbbell for power loads', prise='100'}";

        assertEquals(expected, sportsEquipment.toString());
    }

    @Test
    void toStringFalse() {
        SportsEquipment sportsEquipment = new SportsEquipment(
                "Dumbbell",
                "black",
                "dumbbell for power loads",
                100);
        String expected = "SportsEquipment{nameOfProduct='Expander', category='Equipment', color='black', " +
                "description='dumbbell for power loads', prise='100'}";

        assertNotEquals(expected, sportsEquipment.toString());
    }
}