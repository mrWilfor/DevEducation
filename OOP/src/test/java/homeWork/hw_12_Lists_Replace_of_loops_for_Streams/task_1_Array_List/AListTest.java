package homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_1_Array_List;

import homeWork.hw_11_Lists.task_1_Array_List.AList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AListTest {
    private AList list;

    @BeforeEach
    public void initialisationOfList() {
        list = new AList();
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
    }

    @Test
    void emptyList_getElement_IndexOfBoundException() {
        list = new AList();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void fillingList_getElement_Element() {
        list = new AList();
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
    void fillingList_getElement_IndexMoreThanSizeOfList() {
        list = new AList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
    }

    @Test
    void fillingList_getElement_IndexLessThanZero() {
        list = new AList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void listOf10Items_addElement_ListOf11Items() {
        Object object11 = new Object();

        list.add(object11);

        int expectedSize = 11;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object11, list.get(10));
    }

    @Test
    void emptyList_add5Elements_ListOf5Items() {
        list = new AList();
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
    void emptyList_addOneElements_ListOfOneItems() {
        list = new AList();
        Object object1 = new Object();

        list.add(object1);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, list.get(0));
    }

    @Test
    void emptyList_addNull_ListOfOneItems() {
        list = new AList();

        list.add(null);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertNull(list.get(0));
    }

    @Test
    void listOf10Items_addFirst_ListOf11Items() {
        list = new AList();
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

        list.addFirst(object1);
        list.addFirst(object2);
        list.addFirst(object3);
        list.addFirst(object4);
        list.addFirst(object5);
        list.addFirst(object6);
        list.addFirst(object7);
        list.addFirst(object8);
        list.addFirst(object9);
        list.addFirst(object10);
        list.addFirst(object11);

        int expectedSize = 11;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object11, list.get(0));
        assertEquals(object10, list.get(1));
        assertEquals(object9, list.get(2));
        assertEquals(object8, list.get(3));
        assertEquals(object7, list.get(4));
        assertEquals(object6, list.get(5));
        assertEquals(object5, list.get(6));
        assertEquals(object4, list.get(7));
        assertEquals(object3, list.get(8));
        assertEquals(object2, list.get(9));
        assertEquals(object1, list.get(10));
    }

    @Test
    void emptyList_addFirst5Items_ListOf5Items() {
        list = new AList();
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
    void emptyList_addFirst_ListOfOneItems() {
        list = new AList();
        Object object1 = new Object();

        list.addFirst(object1);

        int expectedSize = 1;
        int actualSize = list.size();
        Object actualFirst = list.get(0);

        assertEquals(expectedSize, actualSize);
        assertEquals(object1, actualFirst);
    }

    @Test
    void emptyList_addFirstNull_ListOfOneItems() {
        list = new AList();

        list.addFirst(null);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void listOf10Items_addByIndexOneItem_ListOf11Items() {
        Object object11 = new Object();

        list.add(5, object11);

        int expectedSize = 11;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertEquals(object11, list.get(5));
    }

    @Test
    void listOf4Items_addByIndexOneItem_ListOf5Items() {
        list = new AList();
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
    void listOf4Items_addByIndex_IndexMoreThanSize() {
        list = new AList();
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
    void listOf4Items_addByIndex_IndexLessThanZero() {
        list = new AList();
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
    void listOf4Items_addByIndexNull_ListOf5Items() {
        list = new AList();
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
    void listOf10Items_RemoveOneItem_ListOf9Items() {
        Object o = list.get(2);
        list.remove(o);

        int expectedSize = 9;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
        assertFalse(list.contains(o));
    }

    @Test
    void listOf10Items_RemoveOneItem_ObjectNotExist() {
        Object object11 = new Object();
        list.remove(object11);

        int expectedSize = 10;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void emptyList_RemoveOneItem_True() {
        list = new AList();
        Object object1 = new Object();

        list.remove(object1);

        int expectedSize = 0;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void listOf11Items_RemoveNull_ListOf10Items() {
        list.add(null);
        list.remove(null);

        int expectedSize = 10;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void listOf11Items_RemoveByIndex_IndexMoreThanSize() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(11));
    }

    @Test
    void listOf11Items_RemoveByIndex_IndexLessThanZero() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    void emptyList_RemoveByIndex_IndexOfBoundException() {
        list = new AList();

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(6));
    }

    @Test
    void listOf3Items_Contains_True() {
        list = new AList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertTrue(list.contains(object1));
    }

    @Test
    void listOf3Items_Contains_False() {
        list = new AList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object2);
        list.add(object3);

        assertFalse(list.contains(object1));
    }

    @Test
    void emptyList_Contains_False() {
        list = new AList();
        Object object1 = new Object();

        assertFalse(list.contains(object1));
    }

    @Test
    void listOf3Items_ContainsNull_True() {
        list = new AList();
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
    void emptyList_isEmpty_True() {
        list = new AList();

        assertTrue(list.isEmpty());
    }

    @Test
    void listOfOneItem_isEmpty_False() {
        list = new AList();
        Object object1 = new Object();

        list.add(object1);

        assertFalse(list.isEmpty());
    }

    @Test
    void listOfClean_isEmpty_True() {
        list = new AList();
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
    void removeAllFromList_isEmpty_True() {
        list = new AList();
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