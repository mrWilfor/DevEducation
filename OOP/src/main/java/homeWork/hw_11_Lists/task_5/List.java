package homeWork.hw_11_Lists.task_5;

public interface List<T> {

    /**
     * return object by index
     *
     * @param index number of item into list
     * @return item by index number
     */
    T get(int index) throws IndexOutOfBoundsException;

    /**
     * add object to list
     *
     * @param item which adding to list
     * @return true if operation was successfully
     */
    boolean add(T item);

    /**
     * adding object to begin of list
     *
     * @param item which adding to list
     * @return true if operation was successfully
     */
    boolean addFirst(T item);

    /**
     * adding an object to the list by index number and move all elements after it 1 cell forward
     *
     * @param index number of cell into the list where the element will be set
     * @param item  the element which will by set into the list
     * @return true if operation was successfully
     * @throws IndexOutOfBoundsException if index more than, equals to size of list or less than zero
     */
    boolean add(int index, T item) throws IndexOutOfBoundsException;

    /**
     * delete the element from the list
     *
     * @param item the element which will be delete from the list
     * @return true if the element was deleted
     */
    boolean remove(T item);

    /**
     * delete the element from the list by index
     *
     * @param index number of the element which will be delete from the list
     * @return the element which was deleted
     */
    T remove(int index) throws IndexOutOfBoundsException;

    /**
     * deletes all elements from the list and return the list to its initial state
     */
    void clear();

    /**
     * checking if the object is into the list
     *
     * @param item element with which compare list`s elements
     * @return true if element is into the list
     */
    boolean contains(T item);

    /**
     * return size of the list
     *
     * @return quantity of elements of the list
     */
    int size();

    /**
     * checks if the list is empty
     *
     * @return true if the list is empty
     */
    boolean isEmpty();
}
