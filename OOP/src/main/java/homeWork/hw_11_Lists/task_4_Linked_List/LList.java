package homeWork.hw_11_Lists.task_4_Linked_List;

import homeWork.hw_11_Lists.task_2_Interface_List.List;

public class LList implements List {
    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        } else if (index == 0) {
            return firstNode.item;
        }
        Node result = firstNode;

        for (int i = 1; i < size; i++) {
            result = result.next;

            if (index == i) {
                break;
            }
        }
        return result.item;
    }

    @Override
    public boolean add(Object item) {
        if (size == 0) {
            firstNode = new Node(null, item, null);
            lastNode = firstNode;
            size++;
        } else if (size == 1) {
            lastNode = new Node(firstNode, item, null);
            firstNode.next = lastNode;
            size++;
        } else {
            lastNode.next = new Node(lastNode, item, null);
            lastNode = lastNode.next;
            size++;
        }
        return true;
    }

    @Override
    public boolean addFirst(Object item) {
        if (size == 0) {
            firstNode = new Node(null, item, null);
            lastNode = firstNode;
            size++;
        } else {
            firstNode.prev = new Node(null, item, firstNode);
            firstNode = firstNode.prev;
            size++;
        }
        return true;
    }

    @Override
    public boolean add(int index, Object item) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            if (size == 0) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            throw new IndexOutOfBoundsException("Out of range index, enter index from 0 to " + (size - 1));
        }
        Node oldNode = firstNode;

        if (index == 0) {
            Node newNode = new Node(oldNode.prev, item, oldNode);
            firstNode = newNode;
        } else {
            for (int i = 1; i < size; i++) {
                oldNode = oldNode.next;

                if (index == i) {
                    Node newNode = new Node(oldNode.prev, item, oldNode);
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
    public boolean remove(Object item) {
        if (size == 0) {
            return false;
        }

        Node deleteNoda = firstNode;

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
    public Object remove(int index) {
        Object result = get(index);
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
    public boolean contains(Object item) {
        Node findingNoda = firstNode;

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

    private static class Node {
        Object item;
        Node next;
        Node prev;

        Node(Node prev, Object element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
