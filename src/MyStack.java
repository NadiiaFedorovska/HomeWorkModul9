import java.util.NoSuchElementException;

public class MyStack<T> {
    private Node node;
    private int count;

    public void push(Object value) {
        Node oldNode = node;
        node = new Node();
        node.setNext(oldNode);
        node.setValue((T) value);
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            node = node.getNext();
        } else {
            Node prev = getNode(index - 1);
            prev.setNext(prev.getNext().getNext());
            System.out.println("Remove element value: " + prev.getValue()+ " for index: " + index);
        }
        count--;

    }

    private Node getNode(int index) {
        Node current = node;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void clear() {
        node = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public T peek() {
        if (node == null) {
            return null;
        }
        return (T) node.getValue();
    }

    public T pop() {
        if (count == 0) {
            throw new NoSuchElementException();
        }
        T value = (T) node.getValue();
        node = node.getNext();
        count--;
        return value;
    }
}

