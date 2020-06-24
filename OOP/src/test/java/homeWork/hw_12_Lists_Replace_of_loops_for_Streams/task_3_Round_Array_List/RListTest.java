package homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_3_Round_Array_List;

import homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_2_Interface_List.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RListTest {
    private List list;

    @BeforeEach
    public void initialisationOfList() {
        list = new RList();
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
        list = new RList();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1), "List is not empty");
    }

    @Test
    void fillingList_getElement_Element() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        Object actual = list.get(1);

        assertEquals(object2, actual, "Not found element");
    }

    @Test
    void fillingList_getElement_IndexMoreThanSizeOfList() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3), "entered index <= list.length");
    }

    @Test
    void fillingList_getElement_IndexLessThanZero() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1), "entered index >= 0");
    }

    @Test
    void listOf10Items_addElement_ListOf11Items() {
        Object object11 = new Object();

        list.add(object11);

        int expectedSize = 11;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object11, list.get(10), "last element had not adding");
    }

    @Test
    void emptyList_add5Elements_ListOf5Items() {
        list = new RList();
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

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object1, list.get(0), "element had not adding ".concat(object1.toString()));
        assertEquals(object2, list.get(1), "element had not adding ".concat(object2.toString()));
        assertEquals(object3, list.get(2), "element had not adding ".concat(object3.toString()));
        assertEquals(object4, list.get(3), "element had not adding ".concat(object4.toString()));
        assertEquals(object5, list.get(4), "element had not adding ".concat(object5.toString()));
    }

    @Test
    void emptyList_addOneElements_ListOfOneItems() {
        list = new RList();
        Object object1 = new Object();

        list.add(object1);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object1, list.get(0), "element had not adding ".concat(object1.toString()));
    }

    @Test
    void emptyList_addNull_ListOfOneItems() {
        list = new RList();

        list.add(null);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertNull(list.get(0), "Null element had not adding");
    }

    @Test
    void listOf10Items_addFirst_ListOf11Items() {
        list = new RList();
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

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object11, list.get(0), "element had not adding ".concat(object11.toString()));
        assertEquals(object10, list.get(1), "element had not adding ".concat(object10.toString()));
        assertEquals(object9, list.get(2), "element had not adding ".concat(object9.toString()));
        assertEquals(object8, list.get(3), "element had not adding ".concat(object8.toString()));
        assertEquals(object7, list.get(4), "element had not adding ".concat(object7.toString()));
        assertEquals(object6, list.get(5), "element had not adding ".concat(object6.toString()));
        assertEquals(object5, list.get(6), "element had not adding ".concat(object5.toString()));
        assertEquals(object4, list.get(7), "element had not adding ".concat(object4.toString()));
        assertEquals(object3, list.get(8), "element had not adding ".concat(object3.toString()));
        assertEquals(object2, list.get(9), "element had not adding ".concat(object2.toString()));
        assertEquals(object1, list.get(10), "element had not adding ".concat(object1.toString()));
    }

    @Test
    void emptyList_addFirst5Items_ListOf5Items() {
        list = new RList();
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

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object5, list.get(0), "element had not adding ".concat(object5.toString()));
        assertEquals(object4, list.get(1), "element had not adding ".concat(object4.toString()));
        assertEquals(object3, list.get(2), "element had not adding ".concat(object3.toString()));
        assertEquals(object2, list.get(3), "element had not adding ".concat(object2.toString()));
        assertEquals(object1, list.get(4), "element had not adding ".concat(object1.toString()));
    }

    @Test
    void emptyList_addFirst_ListOfOneItems() {
        list = new RList();
        Object object1 = new Object();

        list.addFirst(object1);

        int expectedSize = 1;
        int actualSize = list.size();
        Object actualFirst = list.get(0);

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object1, actualFirst, "element had not adding ".concat(object1.toString()));
    }

    @Test
    void emptyList_addFirstNull_ListOfOneItems() {
        list = new RList();

        list.addFirst(null);

        int expectedSize = 1;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "Null elements had not adding");
    }

    @Test
    void listOf10Items_addByIndexOneItem_ListOf11Items() {
        Object object11 = new Object();

        list.add(5, object11);

        int expectedSize = 11;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object11, list.get(5), "element had not adding ".concat(object11.toString()));
    }

    @Test
    void listOf4Items_addByIndexOneItem_ListOf5Items() {
        list = new RList();
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

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertEquals(object1, list.get(0), "element had not adding ".concat(object1.toString()));
        assertEquals(object2, list.get(1), "element had not adding ".concat(object2.toString()));
        assertEquals(object5, list.get(2), "element had not adding ".concat(object5.toString()));
        assertEquals(object3, list.get(3), "element had not adding ".concat(object3.toString()));
        assertEquals(object4, list.get(4), "element had not adding ".concat(object4.toString()));
    }

    @Test
    void listOf4Items_addByIndex_IndexMoreThanSize() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, object5), "invalid index");
    }

    @Test
    void listOf4Items_addByIndex_IndexLessThanZero() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, object5), "invalid index");
    }

    @Test
    void listOf4Items_addByIndexNull_ListOf5Items() {
        list = new RList();
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

        assertEquals(expectedSize, actualSize, "all elements had not adding");
        assertNull(actualObject, "Null elements had not adding");
    }

    @Test
    void listOf10Items_RemoveOneItem_ListOf9Items() {
        Object o = list.get(2);
        list.remove(o);

        int expectedSize = 9;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "element had not deleting");
        assertFalse(list.contains(o), "element had not deleting".concat(o.toString()));
    }

    @Test
    void listOf10Items_RemoveOneItem_ObjectNotExist() {
        Object object11 = new Object();
        list.remove(object11);

        int expectedSize = 10;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "element had not deleting");
    }

    @Test
    void emptyList_RemoveOneItem_True() {
        list = new RList();
        Object object1 = new Object();

        list.remove(object1);

        int expectedSize = 0;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "element had not deleting");
    }

    @Test
    void listOf11Items_RemoveNull_ListOf10Items() {
        list.add(null);
        list.remove(null);

        int expectedSize = 10;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize, "Null element had not deleting");
    }

    @Test
    void listOf11Items_RemoveByIndex_IndexMoreThanSize() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(11), "index is valid");
    }

    @Test
    void listOf11Items_RemoveByIndex_IndexLessThanZero() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1), "index is valid");
    }

    @Test
    void emptyList_RemoveByIndex_IndexOfBoundException() {
        list = new RList();

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(6), "index is valid");
    }

    @Test
    void listOf3Items_Contains_True() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);

        assertTrue(list.contains(object1), "list is not containing item");
    }

    @Test
    void listOf3Items_Contains_False() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object2);
        list.add(object3);

        assertFalse(list.contains(object1), "list is containing item");
    }

    @Test
    void emptyList_Contains_False() {
        list = new RList();
        Object object1 = new Object();

        assertFalse(list.contains(object1));
    }

    @Test
    void listOf3Items_ContainsNull_True() {
        list = new RList();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(null);

        assertTrue(list.contains(null), "list is not contains null");
    }

    @Test
    void emptyList_isEmpty_True() {
        list = new RList();

        assertTrue(list.isEmpty(), "list is empty");
    }

    @Test
    void listOfOneItem_isEmpty_False() {
        list = new RList();
        Object object1 = new Object();

        list.add(object1);

        assertFalse(list.isEmpty(), "list is not empty");
    }

    @Test
    void listOfClean_isEmpty_True() {
        list = new RList();
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

        assertTrue(list.isEmpty(), "list is empty");
    }

    @Test
    void removeAllFromList_isEmpty_True() {
        list = new RList();
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

        assertTrue(list.isEmpty(), "list is empty");
    }
}
