package homeWork.hw_11_Lists.task_5_Generic;

public class LTList<T> implements TList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (index == 0) {
            return firstNode.item;
        }
        Node<T> result = firstNode;

        for (int i = 1; i < size; i++) {
            result = result.next;

            if (index == i) {
                break;
            }
        }
        return result.item;
    }

    @Override
    public boolean add(T item) {
        if (size == 0) {
            firstNode = new Node<>(null, item, null);
            lastNode = firstNode;
            size++;
        } else if (size == 1) {
            lastNode = new Node<>(firstNode, item, null);
            firstNode.next = lastNode;
            size++;
        } else {
            lastNode.next = new Node<>(lastNode, item, null);
            lastNode = lastNode.next;
            size++;
        }
        return true;
    }

    @Override
    public boolean addFirst(T item) {
        if (size == 0) {
            firstNode = new Node<>(null, item, null);
            lastNode = firstNode;
            size++;
        } else {
            firstNode.prev = new Node<>(null, item, firstNode);
            firstNode = firstNode.prev;
            size++;
        }
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        }
        Node<T> oldNode = firstNode;

        if (index == 0) {
            Node<T> newNode = new Node<>(oldNode.prev, item, oldNode);
            firstNode = newNode;
        } else {
            for (int i = 1; i < size; i++) {
                oldNode = oldNode.next;

                if (index == i) {
                    Node<T> newNode = new Node<>(oldNode.prev, item, oldNode);
                    oldNode.prev.next = newNode;
                    oldNode.prev = newNode;
                    size++;
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public boolean remove(T item) {
        if (size == 0) {
            return false;
        }

        Node<T> deleteNoda = firstNode;

        if (item == null ? deleteNoda.item == item : deleteNoda.item.equals(item)) {
            firstNode = firstNode.next;

            if (size == 1) {
                size--;
                return true;
            }
            firstNode.prev = null;
            size--;
            return true;
        }

        for (int i = 1; i < size; i++) {
            deleteNoda = deleteNoda.next;

            if (item == null ? deleteNoda.item == item : deleteNoda.item.equals(item)) {
                if (deleteNoda.equals(lastNode)) {
                    lastNode = lastNode.prev;
                    lastNode.next = null;
                } else {
                    deleteNoda.prev.next = deleteNoda.next;
                    deleteNoda.next.prev = deleteNoda.prev;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        T result = get(index);
        remove(result);
        return result;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public boolean contains(T item) {
        Node<T> findingNoda = firstNode;

        if (firstNode == null) {
            return false;
        } else if (item == null ? findingNoda.item == item : findingNoda.item.equals(item)) {
            return true;
        }

        for (int i = 1; i < size; i++) {
            findingNoda = findingNoda.next;

            if (item == null ? findingNoda.item == item : findingNoda.item.equals(item)) {
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

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
