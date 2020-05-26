package homeWork.hw_8_Parth_3_19_05_2020.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TourismTest {

    @Test
    void equals() {
        Tourism tourism = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        Tourism tourism2 = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );

        assertTrue(tourism.equals(tourism2));
    }

    @Test
    void equalsFail() {
        Tourism tourism = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        Tourism tourism2 = new Tourism(
                "tent",
                "red",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );

        assertFalse(tourism.equals(tourism2));
    }

    @Test
    void hashCodeTrue() {
        Tourism tourism = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        Tourism tourism2 = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );

        assertEquals(tourism.hashCode(), tourism2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        Tourism tourism = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        Tourism tourism2 = new Tourism(
                "tent",
                "red",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );

        assertNotEquals(tourism.hashCode(), tourism2.hashCode());
    }

    @Test
    void toStringTrue() {
        Tourism tourism = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        String expected = "Tourism{" +
                "nameOfProduct='tent', " +
                "nameOfDepartment='null', " +
                "category='Tourism', " +
                "color='green', " +
                "description='for camping', " +
                "prise=300, " +
                "status=false, " +
                "instruction='set on a flat surface and fasten'" +
                "}";

        assertEquals(expected, tourism.toString());
    }

    @Test
    void toStringFalse() {
        Tourism tourism = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        String expected = "Tourism{" +
                "nameOfProduct='tent', " +
                "nameOfDepartment='null', " +
                "category='Tourism', " +
                "color='red', " +
                "description='for camping', " +
                "prise=300, " +
                "status=false, " +
                "instruction='set on a flat surface and fasten'" +
                "}";

        assertNotEquals(expected, tourism.toString());
    }
}