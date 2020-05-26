package homeWork.hw_8_Parth_3_19_05_2020.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SportsWearTest {

    @Test
    void equals() {
        SportsWear sportsWear = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        SportsWear sportsWear2 = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        assertTrue(sportsWear.equals(sportsWear2));
    }

    @Test
    void equalsFail() {
        SportsWear sportsWear = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        SportsWear sportsWear2 = new SportsWear(
                "sports trousers",
                "red",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        assertFalse(sportsWear.equals(sportsWear2));
    }

    @Test
    void hashCodeTrue() {
        SportsWear sportsWear = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        SportsWear sportsWear2 = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        assertEquals(sportsWear.hashCode(), sportsWear2.hashCode());
    }

    @Test
    void hashCodeFalse() {
        SportsWear sportsWear = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        SportsWear sportsWear2 = new SportsWear(
                "sports trousers",
                "red",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );

        assertNotEquals(sportsWear.hashCode(), sportsWear2.hashCode());
    }

    @Test
    void toStringTrue() {
        SportsWear sportsWear = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        String expected = "SportsWear{" +
                "nameOfProduct='sports trousers', " +
                "nameOfDepartment='null', " +
                "category='Sports wear', " +
                "color='blue', " +
                "description='for sports and everyday wear', " +
                "prise=200, " +
                "status=false, " +
                "size='34', " +
                "typeOfWear='trousers" +
                "'}";

        assertEquals(expected, sportsWear.toString());
    }

    @Test
    void toStringFalse() {
        SportsWear sportsWear = new SportsWear(
                "sports trousers",
                "red",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        String expected ="SportsWear{" +
                "nameOfProduct='sports trousers', " +
                "nameOfDepartment='null', " +
                "category='Sports wear', " +
                "color='blue', " +
                "description='for sports and everyday wear', " +
                "prise=200, " +
                "status=false, " +
                "size='34', " +
                "typeOfWear='trousers" +
                "'}";

        assertNotEquals(expected, sportsWear.toString());
    }
}