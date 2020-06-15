package homeWork.hw_11_Lists.task_5;

public class AList<T> implements List<T> {
    private T[] objects = (T[]) new Object[10];
    private int size = 0;

    public AList() {
    }


    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return objects[index];
    }

    @Override
    public boolean add(T item) {
        if (size == objects.length) {
            T[] newObjects = (T[]) new Object[size * 3 / 2 + 1];

            System.arraycopy(objects, 0, newObjects, 0, size);

            newObjects[size] = item;
            objects = newObjects;
            size++;
            return true;
        }
        objects[size] = item;
        size++;
        return true;
    }

    @Override
    public boolean addFirst(T item) {
        if (size == objects.length) {
            T[] newObjects = (T[]) new Object[size * 3 / 2 + 1];

            System.arraycopy(objects, 0, newObjects, 1, size);

            newObjects[0] = item;
            objects = newObjects;
            size++;
            return true;
        }
        System.arraycopy(objects, 0, objects, 1, size);

        objects[0] = item;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (size == objects.length) {
            T[] newObjects = (T[]) new Object[size * 3 / 2 + 1];

            System.arraycopy(objects, 0, newObjects, 0, index);
            System.arraycopy(objects, index, newObjects, index + 1, size - (index));

            newObjects[index] = item;
            objects = newObjects;
            size++;
            return true;
        }
        System.arraycopy(objects, index, objects, index + 1, size - (index));

        objects[index] = item;
        size++;
        return true;
    }

    @Override
    public boolean remove(T item) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if ((item == objects[i]) || objects[i].equals(item)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            if (index == size - 1) {
                objects[index] = null;
            } else {
                System.arraycopy(objects, index + 1, objects, index, size - (index));
                objects[size - 1] = null;
            }
            size--;
            return true;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        T result;

        if (size == 0 || index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == size - 1) {
            result = objects[index];
            objects[index] = null;
        } else {
            result = objects[index];
            System.arraycopy(objects, index + 1, objects, index, size - (index));
            objects[size - 1] = null;
        }
        size--;
        return result;
    }

    @Override
    public void clear() {
        objects = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            if ((item == objects[i]) || objects[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
