package homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_1_Array_List;

import homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_2_Interface_List.List;

import java.util.Arrays;
import java.util.stream.Stream;

public class AList implements List {
    private Object[] objects = new Object[10];
    private int size = 0;

    public AList() {
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        }
        return objects[index];
    }

    @Override
    public boolean add(Object item) {
        if (size == objects.length) {
            objects = (Stream.concat(Stream.concat(Arrays.stream(objects), Stream.of(item)),
                    Stream.of(new Object[(size * 3 / 2 + 1) - size - 1])))
                    .toArray();
            size++;
            return true;
        }
        objects[size] = item;
        size++;
        return true;
    }

    @Override
    public boolean addFirst(Object item) {
        if (size == objects.length) {
            objects = Stream.concat(Stream.concat(Stream.of(item), Arrays.stream(objects)),
                    Stream.of(new Object[(size * 3 / 2 + 1) - size - 1]))
                    .toArray();
            size++;
            return true;
        }
        objects = Stream.concat(Stream.of(item), Arrays.stream(objects).limit(objects.length - 1))
                .toArray();
        size++;
        return true;
    }

    @Override
    public boolean add(int index, Object item) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (size == objects.length) {
            objects = Stream.concat(
                    Stream.concat(Stream.concat(Arrays.stream(objects).limit(index), Stream.of(item)),
                            Arrays.stream(objects).skip(index)),
                    Stream.of(new Object[(size * 3 / 2 + 1) - size - 1])
            ).toArray();
            size++;
            return true;
        }
        objects = Stream.concat(Stream.concat(Arrays.stream(objects).limit(index), Stream.of(item)),
                Arrays.stream(objects).skip(index))
                .toArray();
        size++;
        return true;
    }

    @Override
    public boolean remove(Object item) {
        boolean checkItem = Arrays.stream(objects)
                .anyMatch(x -> (item == null ? item == x : item.equals(x)));

        if (checkItem) {
            objects = Arrays.stream(objects)
                    .filter(x -> !(item == null ? item == x : item.equals(x)))
                    .toArray();
            size--;
            return true;
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        Object result;

        if (size == 0 || index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            result = objects[index];
            objects = Arrays.stream(objects)
                    .filter(x -> !(result == null ? result == x : result.equals(x)))
                    .toArray();
            size--;
        }
        return result;
    }

    @Override
    public void clear() {
        objects = new Object[10];
        size = 0;
    }

    @Override
    public boolean contains(Object item) {
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
