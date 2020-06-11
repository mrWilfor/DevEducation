package homeWork.hw_11_Lists.task_2;

public interface List {
    Object get(int index);

    boolean add(Object item);

    boolean addFirst(Object item);

    boolean add(int index, Object item);

    boolean remove(Object item);

    Object remove(int index);

    void clear();

    boolean contains(Object item);

    int size();

    boolean isEmpty();
}
