package homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_3_Round_Array_List;

import homeWork.hw_12_Lists_Replace_of_loops_for_Streams.task_2_Interface_List.List;

import java.util.Arrays;
import java.util.stream.Stream;

public class RList implements List {
    private Object[] objects = new Object[10];
    private int size = 0;
    private int headOfList = -1;
    private int tailOfList = 0;

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (index + tailOfList >= objects.length) {
            return objects[index + tailOfList - objects.length];
        }
        return objects[index + tailOfList];
    }

    @Override
    public boolean add(Object item) throws IndexOutOfBoundsException {
        if (size == objects.length) {
            if (tailOfList > headOfList) {
                objects = Stream.concat(Stream.concat(Arrays.stream(objects).limit(headOfList + 1), Stream.of(item)),
                        Stream.concat(
                                Stream.of(new Object[(size * 3 / 2 + 1) - size - 1]),
                                Arrays.stream(objects).skip(headOfList)))
                        .toArray();
                tailOfList += (size * 3 / 2 + 1) - size;
            } else {
                objects = (Stream.concat(Stream.concat(Arrays.stream(objects), Stream.of(item)),
                        Stream.of(new Object[(size * 3 / 2 + 1) - size - 1])))
                        .toArray();
            }

            if (headOfList + 1 < objects.length) {
                headOfList++;
            } else {
                headOfList = 0;
            }
            size++;
            return true;
        }
        objects[headOfList + 1] = item;
        headOfList++;
        size++;
        return true;
    }

    @Override
    public boolean addFirst(Object item) throws IndexOutOfBoundsException {
        if (size == objects.length) {
            if (tailOfList > headOfList) {
                objects = Stream.concat(Stream.concat(Arrays.stream(objects).limit(tailOfList),
                        Stream.of(new Object[(size * 3 / 2 + 1) - size - 1])),
                        Stream.concat(
                                Stream.of(item),
                                Arrays.stream(objects).skip(tailOfList)))
                        .toArray();
                tailOfList += (size * 3 / 2 + 1) - size;
            } else {
                objects = (Stream.concat(Stream.concat(Stream.of(item), Arrays.stream(objects)),
                        Stream.of(new Object[(size * 3 / 2 + 1) - size - 1])))
                        .toArray();
            }

            if (tailOfList - 1 > 0) {
                tailOfList--;
            } else {
                tailOfList = objects.length - 1;
            }
            size++;
            return true;
        }

        if (tailOfList - 1 >= 0) {
            tailOfList--;
            objects[tailOfList] = item;
        } else {
            tailOfList = objects.length - 1;
            objects[tailOfList] = item;
        }
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
            if (tailOfList > headOfList) {
                objects = Stream.concat(Arrays.stream(objects).limit(tailOfList + 1),
                        Stream.concat(
                                Stream.of(new Object[(size * 3 / 2 + 1) - size - 2]),
                                Arrays.stream(objects).skip(tailOfList)))
                        .toArray();
                tailOfList += (size * 3 / 2 + 1) - size;
            } else {
                objects = (Stream.concat(Arrays.stream(objects), Stream.of(new Object[(size * 3 / 2 + 1) - size - 2])))
                        .toArray();
            }
        }

        if (index > headOfList && index > tailOfList) {
            objects = Stream.concat(Stream.concat(Stream.concat(
                    Stream.of(objects).skip(objects.length - 1), Stream.of(objects).limit(index)),
                    Stream.of(item)), Stream.of(objects).skip(index).limit(objects.length - index - 2))
                    .toArray();
        } else {
            objects = Stream.concat(
                    Stream.concat(Stream.of(objects).limit(index), Stream.of(item)), Stream.of(objects).skip(index))
                    .toArray();
        }

        if (headOfList + 1 < objects.length) {
            headOfList++;
        } else {
            headOfList = 0;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object item) throws IndexOutOfBoundsException {
        if (contains(item)) {
            if (tailOfList > headOfList) {
                objects = Stream.concat(Stream.concat(Stream.concat(
                        Stream.of(objects).skip(objects.length - 1),
                        Stream.of(objects).filter(x -> !(item == null ? item == x : item.equals(x))).limit(headOfList)),
                        Stream.of(new Object[1])), Stream.of(objects).skip(headOfList + 1))
                        .toArray();
            } else {
                objects = Stream.concat(Stream.of(objects)
                        .filter(x -> !(item == null ? item == x : item.equals(x))), Stream.of(new Object[1]))
                        .toArray();
            }

            if (headOfList - 1 > 0) {
                headOfList--;
            } else {
                headOfList = objects.length - 1;
            }
            size--;
            return true;
        }
        return false;
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        Object result;

        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (index == size - 1) {
            result = objects[index];
        } else {
            result = objects[index];

            if (index > headOfList && index > tailOfList) {
                objects = Stream.concat(Stream.concat(Stream.concat(Stream.concat(
                        Stream.of(objects).skip(objects.length - 1), Stream.of(objects).limit(headOfList + 1)),
                        Stream.of(new Object[1])), Stream.of(objects).skip(headOfList + 1).limit(index - headOfList)),
                        Stream.of(objects).skip(index + 1).limit(objects.length - index - 2))
                        .toArray();
            } else if (tailOfList > headOfList) {
                objects = Stream.concat(Stream.concat(Stream.concat(Stream.concat(
                        Stream.of(objects).skip(objects.length - 1), Stream.of(objects).limit(index)),
                        Stream.of(objects).skip(index + 1).limit(headOfList - (index + 1))),
                        Stream.of(new Object[1])), Stream.of(objects).skip(headOfList + 1))
                        .toArray();
            } else {
                objects = Stream.concat(
                        Stream.concat(Stream.of(objects).limit(index), Stream.of(objects).skip(index + 1)),
                        Stream.of(new Object[1]))
                        .toArray();
            }

            if (headOfList - 1 > 0) {
                headOfList--;
            } else {
                headOfList = objects.length - 1;
            }
        }
        size--;
        return result;
    }

    @Override
    public void clear() {
        objects = new Object[10];
        size = 0;
    }

    @Override
    public boolean contains(Object item) throws IndexOutOfBoundsException {
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
