package homeWork.hw_11_Lists.task_5_Generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LTListTest {

    @Test
    void getWhenSizeListZero() {
       TList<Object> list = new LTList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void getWhenSizeListNotZero() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        Object actual = list.get(1);

        assertEquals(object2, actual);
    }

    @Test
    void getWhenIndexMoreThanSize() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
    }

    @Test
    void getWhenIndexLessThanZero() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void addMany() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);

        int expectedSize = 5;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
        assertEquals(object2, list.get(1));
        assertEquals(object3, list.get(2));
        assertEquals(object4, list.get(3));
        assertEquals(object5, list.get(4));
    }

    @Test
    void addTwo() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();

        list.add(object1);
        list.add(object2);

        int expectedSize = 2;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
        assertEquals(object2, list.get(1));
    }

    @Test
    void addOne() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();

        list.add(object1);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
    }

    @Test
    void addNull() {
       TList<Object> list = new LTList<>();

        list.add(null);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertNull(list.get(0));
    }

    @Test
    void addFirstMany() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.addFirst(object1);
        list.addFirst(object2);
        list.addFirst(object3);
        list.addFirst(object4);
        list.addFirst(object5);

        int expectedSize = 5;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object5, list.get(0));
        assertEquals(object4, list.get(1));
        assertEquals(object3, list.get(2));
        assertEquals(object2, list.get(3));
        assertEquals(object1, list.get(4));
    }

    @Test
    void addFirstTwo() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();

        list.addFirst(object1);
        list.addFirst(object2);

        int expectedSize = 2;
        int actualSize = list.size();


        assertEquals(expectedSize, actualSize);
        assertEquals(object2, list.get(0));
        assertEquals(object1, list.get(1));
    }

    @Test
    void addFirstOne() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();

        list.addFirst(object1);

        int expectedSize = 1;
        int actualSize = list.size();
        Object actualFirst = list.get(0);

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, actualFirst);
    }

    @Test
    void addFirstNull() {
       TList<Object> list = new LTList<>();

        list.addFirst(null);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void addByIndex() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(2, object5);

        int expectedSize = 5;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
        assertEquals(object2, list.get(1));
        assertEquals(object5, list.get(2));
        assertEquals(object3, list.get(3));
        assertEquals(object4, list.get(4));
    }

    @Test
    void addByIndexWhenIndexMoreThanSize() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, object5));
    }

    @Test
    void addByIndexWhenIndexLessThanZero() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, object5));
    }

    @Test
    void addByIndexNull() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(2, null);

        int expectedSize = 5;
        int actualSize = list.size();
        Object actualObject = list.get(2);

        assertEquals(expectedSize, actualSize);
        assertNull(actualObject);
    }

    @Test
    void remove() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();
        Object object6 = new Object();
        Object object7 = new Object();
        Object object8 = new Object();
        Object object9 = new Object();
        Object object10 = new Object();
        Object object11 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.add(object6);
        list.add(object7);
        list.add(object8);
        list.add(object9);
        list.add(object10);
        list.add(object11);
        list.remove(object7);

        int expectedSize = 10;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
        assertEquals(object2, list.get(1));
        assertEquals(object3, list.get(2));
        assertEquals(object4, list.get(3));
        assertEquals(object5, list.get(4));
        assertEquals(object6, list.get(5));
        assertEquals(object8, list.get(6));
        assertEquals(object9, list.get(7));
        assertEquals(object10, list.get(8));
        assertEquals(object11, list.get(9));
    }

    @Test
    void removeWhenObjectNotExist() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();
        Object object6 = new Object();
        Object object7 = new Object();
        Object object8 = new Object();
        Object object9 = new Object();
        Object object10 = new Object();
        Object object11 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.add(object6);
        list.add(object7);
        list.add(object8);
        list.add(object9);
        list.add(object10);
        list.remove(object11);

        int expectedSize = 10;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
        assertEquals(object2, list.get(1));
        assertEquals(object3, list.get(2));
        assertEquals(object4, list.get(3));
        assertEquals(object5, list.get(4));
        assertEquals(object6, list.get(5));
        assertEquals(object7, list.get(6));
        assertEquals(object8, list.get(7));
        assertEquals(object9, list.get(8));
        assertEquals(object10, list.get(9));

    }

    @Test
    void removeWhenSizeZero() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();

        list.remove(object1);

        int expectedSize = 0;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void removeNull() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();
        Object object6 = new Object();
        Object object7 = new Object();
        Object object8 = new Object();
        Object object9 = new Object();
        Object object10 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.add(object6);
        list.add(object7);
        list.add(object8);
        list.add(object9);
        list.add(object10);
        list.add(null);
        list.remove(null);

        int expectedSize = 10;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
        assertEquals(object2, list.get(1));
        assertEquals(object3, list.get(2));
        assertEquals(object4, list.get(3));
        assertEquals(object5, list.get(4));
        assertEquals(object6, list.get(5));
        assertEquals(object7, list.get(6));
        assertEquals(object8, list.get(7));
        assertEquals(object9, list.get(8));
        assertEquals(object10, list.get(9));
    }

    @Test
    void RemoveByIndexWhenIndexMoreThanSize() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();
        Object object6 = new Object();
        Object object7 = new Object();
        Object object8 = new Object();
        Object object9 = new Object();
        Object object10 = new Object();
        Object object11 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.add(object6);
        list.add(object7);
        list.add(object8);
        list.add(object9);
        list.add(object10);
        list.add(object11);

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(11));
    }

    @Test
    void RemoveByIndexWhenIndexLessThanZero() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();
        Object object6 = new Object();
        Object object7 = new Object();
        Object object8 = new Object();
        Object object9 = new Object();
        Object object10 = new Object();
        Object object11 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.add(object6);
        list.add(object7);
        list.add(object8);
        list.add(object9);
        list.add(object10);
        list.add(object11);

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    void RemoveByIndexWhenSizeZero() {
       TList<Object> list = new LTList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(6));
    }

    @Test
    void containsTrue() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertTrue(list.contains(object1));
    }

    @Test
    void containsFalse() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object2);
        list.add(object3);

        assertFalse(list.contains(object1));
    }

    @Test
    void containsWhenSizeZero() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();

        assertFalse(list.contains(object1));
    }

    @Test
    void containsNull() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(null);

        assertTrue(list.contains(null));
    }

    @Test
    void isEmptyTrue() {
       TList<Object> list = new LTList<>();

        assertTrue(list.isEmpty());
    }

    @Test
    void isEmptyFalse() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();

        list.add(object1);

        assertFalse(list.isEmpty());
    }

    @Test
    void isEmptyWhenUsedClear() {
       TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.clear();

        assertTrue(list.isEmpty());
    }

    @Test
    void isEmptyWhenRemoveAll() {
        TList<Object> list = new LTList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.remove(object1);
        list.remove(object2);
        list.remove(object3);
        list.remove(object4);
        list.remove(object5);

        assertTrue(list.isEmpty());
    }
}
