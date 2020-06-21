package homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_6_Set;

public interface Set<T> {

    /**
     * return object by index
     *
     * @param index number of item into ыуе
     * @return item by index number
     */
    T get(int index) throws IndexOutOfBoundsException;

    /**
     * add object to set if there is no such object in the set
     *
     * @param item which adding to set
     * @return true if operation was successfully
     */
    boolean add(T item);

    /**
     * adding object to begin of set if there is no such object in the set
     *
     * @param item which adding to set
     * @return true if operation was successfully
     */
    boolean addFirst(T item);

    /**
     * adding an object to the set by index number if there is no such object in the set
     * and move all elements after it 1 cell forward
     *
     * @param index number of cell into the set where the element will be set
     * @param item  the element which will by set into the set
     * @return true if operation was successfully
     * @throws IndexOutOfBoundsException if index more than, equals to size of set or less than zero
     */
    boolean add(int index, T item) throws IndexOutOfBoundsException;

    /**
     * delete the element from the set
     *
     * @param item the element which will be delete from the set
     * @return true if the element was deleted
     */
    boolean remove(T item);

    /**
     * delete the element from the set by index
     *
     * @param index number of the element which will be delete from the set
     * @return the element which was deleted
     */
    T remove(int index) throws IndexOutOfBoundsException;

    /**
     * deletes all elements from the set and return the set to its initial state
     */
    void clear();

    /**
     * checking if the object is into the set
     *
     * @param item element with which compare set`s elements
     * @return true if element is into the set
     */
    boolean contains(T item);

    /**
     * return size of the set
     *
     * @return quantity of elements of the set
     */
    int size();

    /**
     * checks if the set is empty
     *
     * @return true if the set is empty
     */
    boolean isEmpty();
}
