package homeWork.hw_11_Lists.task_6_Set;

public class LTSet<T> implements Set<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (size == 0 || index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
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
        if (!contains(item)) {
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
        return false;
    }

    @Override
    public boolean addFirst(T item) {
        if (!contains(item)) {
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
        return false;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (!contains(item)) {
            if (size == 0 || index >= size || index < 0) {
                throw new IndexOutOfBoundsException();
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
        return false;
    }

    @Override
    public boolean remove(T item) {
        if (size == 0) {
            return false;
        }

        Node<T> deleteNoda = firstNode;

        if (deleteNoda.item == item || deleteNoda.item.equals(item)) {
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

            if (deleteNoda.item == item || deleteNoda.item.equals(item)) {
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
        } else if (findingNoda.item == item || findingNoda.item.equals(item)) {
            return true;
        }

        for (int i = 1; i < size; i++) {
            findingNoda = findingNoda.next;

            if (findingNoda.item == item || findingNoda.item.equals(item)) {
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
