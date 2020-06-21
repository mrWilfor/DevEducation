package homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_5_Generic;

public class RTList<T> implements TList<T> {
    private T[] objects = (T[]) new Object[10];
    private int size = 0;
    private int headOfList = -1;
    private int tailOfList = 0;

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (index + tailOfList > objects.length) {
            return objects[index + tailOfList - objects.length];
        }
        return objects[index + tailOfList];
    }

    @Override
    public boolean add(T item) throws IndexOutOfBoundsException {
        if (size == objects.length) {
            T[] newObjects = (T[]) new Object[size * 3 / 2 + 1];

            if (tailOfList > headOfList) {
                if (headOfList + 1 >= 0) {
                    System.arraycopy(objects, 0, newObjects, 0, headOfList + 1);
                }

                for (int j = newObjects.length - 1, k = objects.length - 1; k >= tailOfList; j--, k--) {
                    if (k == tailOfList) {
                        tailOfList = j;
                    }
                    newObjects[j] = objects[k];
                }
            } else {
                System.arraycopy(objects, tailOfList, newObjects, tailOfList, size);
            }

            try {
                newObjects[headOfList + 1] = item;
                headOfList += 1;
            } catch (IndexOutOfBoundsException e) {
                headOfList = 0;
                newObjects[headOfList] = item;
            }
            objects = newObjects;
            size++;
            return true;
        }
        objects[headOfList + 1] = item;
        headOfList += 1;
        size++;
        return true;
    }

    @Override
    public boolean addFirst(T item) throws IndexOutOfBoundsException {
        if (size == objects.length) {
            T[] newObjects = (T[]) new Object[size * 3 / 2 + 1];

            if (tailOfList > headOfList) {
                if (headOfList + 1 >= 0) {
                    System.arraycopy(objects, 0, newObjects, 0, headOfList + 1);
                }

                for (int j = newObjects.length - 1, k = objects.length - 1; k >= tailOfList; j--, k--) {
                    if (k == tailOfList) {
                        tailOfList = j;
                    }
                    newObjects[j] = objects[k];
                }
            } else {
                System.arraycopy(objects, tailOfList, newObjects, tailOfList, size);
            }
            objects = newObjects;
        }

        try {
            objects[tailOfList - 1] = item;
            tailOfList -= 1;
        } catch (IndexOutOfBoundsException e) {
            tailOfList = objects.length - 1;
            objects[tailOfList] = item;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (size == objects.length) {
            T[] newObjects = (T[]) new Object[size * 3 / 2 + 1];

            if (tailOfList > headOfList) {
                if (headOfList + 1 >= 0) {
                    System.arraycopy(objects, 0, newObjects, 0, headOfList + 1);
                }

                for (int j = newObjects.length - 1, k = objects.length - 1; k >= tailOfList; j--, k--) {
                    if (k == tailOfList) {
                        tailOfList = j;
                    }
                    newObjects[j] = objects[k];
                }
            } else {
                System.arraycopy(objects, tailOfList, newObjects, tailOfList, size);
            }
            objects = newObjects;
        }

        T bufferObject1 = null;
        T bufferObject2;

        for (int i = index, j = index + tailOfList; i < size; i++, j++) {
            try {
                if (bufferObject1 == null) {
                    bufferObject1 = objects[j + 1];
                    objects[j + 1] = objects[j];
                } else {
                    bufferObject2 = objects[j + 1];
                    objects[j + 1] = bufferObject1;
                    bufferObject1 = bufferObject2;
                }
            } catch (IndexOutOfBoundsException e) {
                if (bufferObject1 == null) {
                    bufferObject1 = objects[0];
                    objects[0] = objects[j];
                } else {
                    bufferObject2 = objects[0];
                    objects[0] = bufferObject1;
                    bufferObject1 = bufferObject2;
                }
                j = -1;
            }
        }
        objects[index + tailOfList] = item;
        size++;
        return true;
    }

    @Override
    public boolean remove(T item) throws IndexOutOfBoundsException {
        for (int i = 0, j = tailOfList; i < size; i++, j++) {
            try {
                if (item == null ? item == objects[i] : item.equals(objects[i])) {
                    for (int k = i, l = j; k < size; k++, l++) {
                        try {
                            objects[l] = objects[l + 1];
                        } catch (IndexOutOfBoundsException e) {
                            objects[l] = objects[0];
                            l = 0;
                        }
                    }
                    size--;
                    objects[size] = null;
                    return true;
                }
            } catch (IndexOutOfBoundsException e) {
                j = -1;
                i--;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        T result;

        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (index == size - 1) {
            result = objects[index];
        } else {
            result = objects[index];

            for (int i = index, j = index + tailOfList; i < size; i++, j++) {
                try {
                    objects[j] = objects[j + 1];
                } catch (IndexOutOfBoundsException e) {
                    objects[j] = objects[0];
                    j = 0;
                }
            }
        }
        size--;
        objects[size] = null;
        return result;
    }

    @Override
    public void clear() {
        objects = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public boolean contains(T item) throws IndexOutOfBoundsException {
        for (int i = 0, j = tailOfList; i < size; i++, j++) {
            try {
                if (item == null ? item == objects[i] : item.equals(objects[i])) {
                    return true;
                }
            } catch (IndexOutOfBoundsException e) {
                j = -1;
                i--;
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
