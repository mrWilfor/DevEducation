package homeWork.hw_11_Lists.task_6_Set;

import homeWork.hw_11_Lists.task_5_Generic.LTList;
import homeWork.hw_11_Lists.task_5_Generic.TList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LTSetTest {

    @Test
    void getWhenSizeListZero() {
        Set<Object> set = new LTSet<>();

        assertThrows(IndexOutOfBoundsException.class, () -> set.get(1));
    }

    @Test
    void getWhenSizeListNotZero() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);

        Object actual = set.get(1);

        assertEquals(object2, actual);
    }

    @Test
    void getWhenIndexMoreThanSize() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> set.get(3));
    }

    @Test
    void getWhenIndexLessThanZero() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> set.get(-1));
    }

    @Test
    void addIdenticalObjects() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();

        set.add(object1);

        assertFalse(set.add(object1));
    }

    @Test
    void addMany() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);

        int expectedSize = 5;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, set.get(0));
        assertEquals(object2, set.get(1));
        assertEquals(object3, set.get(2));
        assertEquals(object4, set.get(3));
        assertEquals(object5, set.get(4));
    }

    @Test
    void addTwo() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();

        set.add(object1);
        set.add(object2);

        int expectedSize = 2;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, set.get(0));
        assertEquals(object2, set.get(1));
    }

    @Test
    void addOne() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();

        set.add(object1);

        int expectedSize = 1;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, set.get(0));
    }

    @Test
    void addNull() {
        Set<Object> set = new LTSet<>();

        set.add(null);

        int expectedSize = 1;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertNull(set.get(0));
    }

    @Test
    void addFirstIdenticalObjects() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();

        set.addFirst(object1);

        assertFalse(set.addFirst(object1));
    }

    @Test
    void addFirstMany() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        set.addFirst(object1);
        set.addFirst(object2);
        set.addFirst(object3);
        set.addFirst(object4);
        set.addFirst(object5);

        int expectedSize = 5;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object5, set.get(0));
        assertEquals(object4, set.get(1));
        assertEquals(object3, set.get(2));
        assertEquals(object2, set.get(3));
        assertEquals(object1, set.get(4));
    }

    @Test
    void addFirstTwo() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();

        set.addFirst(object1);
        set.addFirst(object2);

        int expectedSize = 2;
        int actualSize = set.size();


        assertEquals(expectedSize, actualSize);
        assertEquals(object2, set.get(0));
        assertEquals(object1, set.get(1));
    }

    @Test
    void addFirstOne() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();

        set.addFirst(object1);

        int expectedSize = 1;
        int actualSize = set.size();
        Object actualFirst = set.get(0);

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, actualFirst);
    }

    @Test
    void addFirstNull() {
        Set<Object> set = new LTSet<>();

        set.addFirst(null);

        int expectedSize = 1;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void addByIndexIdenticalObjects() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);

        assertFalse(set.add(2, object1));
    }

    @Test
    void addByIndex() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(2, object5);

        int expectedSize = 5;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, set.get(0));
        assertEquals(object2, set.get(1));
        assertEquals(object5, set.get(2));
        assertEquals(object3, set.get(3));
        assertEquals(object4, set.get(4));
    }

    @Test
    void addByIndexWhenIndexMoreThanSize() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);

        assertThrows(IndexOutOfBoundsException.class, () -> set.add(5, object5));
    }

    @Test
    void addByIndexWhenIndexLessThanZero() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);

        assertThrows(IndexOutOfBoundsException.class, () -> set.add(-1, object5));
    }

    @Test
    void addByIndexNull() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(2, null);

        int expectedSize = 5;
        int actualSize = set.size();
        Object actualObject = set.get(2);

        assertEquals(expectedSize, actualSize);
        assertNull(actualObject);
    }

    @Test
    void remove() {
        Set<Object> set = new LTSet<>();
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

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.add(object6);
        set.add(object7);
        set.add(object8);
        set.add(object9);
        set.add(object10);
        set.add(object11);
        set.remove(object7);

        int expectedSize = 10;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, set.get(0));
        assertEquals(object2, set.get(1));
        assertEquals(object3, set.get(2));
        assertEquals(object4, set.get(3));
        assertEquals(object5, set.get(4));
        assertEquals(object6, set.get(5));
        assertEquals(object8, set.get(6));
        assertEquals(object9, set.get(7));
        assertEquals(object10, set.get(8));
        assertEquals(object11, set.get(9));
    }

    @Test
    void removeWhenObjectNotExist() {
        Set<Object> set = new LTSet<>();
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

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.add(object6);
        set.add(object7);
        set.add(object8);
        set.add(object9);
        set.add(object10);
        set.remove(object11);

        int expectedSize = 10;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, set.get(0));
        assertEquals(object2, set.get(1));
        assertEquals(object3, set.get(2));
        assertEquals(object4, set.get(3));
        assertEquals(object5, set.get(4));
        assertEquals(object6, set.get(5));
        assertEquals(object7, set.get(6));
        assertEquals(object8, set.get(7));
        assertEquals(object9, set.get(8));
        assertEquals(object10, set.get(9));

    }

    @Test
    void removeWhenSizeZero() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();

        set.remove(object1);

        int expectedSize = 0;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void removeNull() {
        Set<Object> set = new LTSet<>();
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

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.add(object6);
        set.add(object7);
        set.add(object8);
        set.add(object9);
        set.add(object10);
        set.add(null);
        set.remove(null);

        int expectedSize = 10;
        int actualSize = set.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, set.get(0));
        assertEquals(object2, set.get(1));
        assertEquals(object3, set.get(2));
        assertEquals(object4, set.get(3));
        assertEquals(object5, set.get(4));
        assertEquals(object6, set.get(5));
        assertEquals(object7, set.get(6));
        assertEquals(object8, set.get(7));
        assertEquals(object9, set.get(8));
        assertEquals(object10, set.get(9));
    }

    @Test
    void RemoveByIndexWhenIndexMoreThanSize() {
        Set<Object> set = new LTSet<>();
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

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.add(object6);
        set.add(object7);
        set.add(object8);
        set.add(object9);
        set.add(object10);
        set.add(object11);

        assertThrows(IndexOutOfBoundsException.class, () -> set.remove(11));
    }

    @Test
    void RemoveByIndexWhenIndexLessThanZero() {
        Set<Object> set = new LTSet<>();
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

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.add(object6);
        set.add(object7);
        set.add(object8);
        set.add(object9);
        set.add(object10);
        set.add(object11);

        assertThrows(IndexOutOfBoundsException.class, () -> set.remove(-1));
    }

    @Test
    void RemoveByIndexWhenSizeZero() {
        Set<Object> set = new LTSet<>();

        assertThrows(IndexOutOfBoundsException.class, () -> set.remove(6));
    }

    @Test
    void containsTrue() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);

        assertTrue(set.contains(object1));
    }

    @Test
    void containsFalse() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        set.add(object2);
        set.add(object3);

        assertFalse(set.contains(object1));
    }

    @Test
    void containsWhenSizeZero() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();

        assertFalse(set.contains(object1));
    }

    @Test
    void containsNull() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(null);

        assertTrue(set.contains(null));
    }

    @Test
    void isEmptyTrue() {
        Set<Object> set = new LTSet<>();

        assertTrue(set.isEmpty());
    }

    @Test
    void isEmptyFalse() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();

        set.add(object1);

        assertFalse(set.isEmpty());
    }

    @Test
    void isEmptyWhenUsedClear() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.clear();

        assertTrue(set.isEmpty());
    }

    @Test
    void isEmptyWhenRemoveAll() {
        Set<Object> set = new LTSet<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        set.add(object1);
        set.add(object2);
        set.add(object3);
        set.add(object4);
        set.add(object5);
        set.remove(object1);
        set.remove(object2);
        set.remove(object3);
        set.remove(object4);
        set.remove(object5);

        assertTrue(set.isEmpty());
    }
}
