package homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_5_Generic;

import java.util.Arrays;
import java.util.stream.Stream;

public class ATList<T> implements TList<T> {
    private T[] objects = (T[]) new Object[10];
    private int size = 0;

    public ATList() {
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        }
        return objects[index];
    }

    @Override
    public boolean add(T item) {
        if (size == objects.length) {
            objects = (T[]) Stream.concat(Stream.concat(Arrays.stream(objects), Stream.of(item)),
                    Stream.of((T[]) new Object[(size * 3 / 2 + 1) - size - 1]))
                    .toArray();
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
            objects = (T[]) Stream.concat(Stream.concat(Stream.of(item), Arrays.stream(objects)),
                    Stream.of((T[]) new Object[(size * 3 / 2 + 1) - size - 1]))
                    .toArray();
            size++;
            return true;
        }
        objects = (T[]) Stream.concat(Stream.of(item), Arrays.stream(objects).limit(objects.length - 1))
                .toArray();
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
            objects = (T[]) Stream.concat(
                    Stream.concat(Stream.concat(Arrays.stream(objects).limit(index), Stream.of(item)),
                            Arrays.stream(objects).skip(index)),
                    Stream.of((T[]) new Object[(size * 3 / 2 + 1) - size - 1])
            ).toArray();
            size++;
            return true;
        }
        objects = (T[]) Stream.concat(Stream.concat(Arrays.stream(objects).limit(index), Stream.of(item)),
                Arrays.stream(objects).skip(index))
                .toArray();
        size++;
        return true;
    }

    @Override
    public boolean remove(T item) {
        boolean checkItem = Arrays.stream(objects)
                .anyMatch(x -> (item == null ? item == x : item.equals(x)));

        if (checkItem) {
            objects = (T[]) Arrays.stream(objects)
                    .filter(x -> !(item == null ? item == x : item.equals(x)))
                    .toArray();
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
        } else {
            result = objects[index];
            objects = (T[]) Arrays.stream(objects)
                    .filter(x -> !(result == null ? result == x : result.equals(x)))
                    .toArray();
            size--;
        }
        return result;
    }

    @Override
    public void clear() {
        objects = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public boolean contains(T item) {
        return Arrays.stream(objects)
                .anyMatch(x -> (item == null ? item == x : item.equals(x)));
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
