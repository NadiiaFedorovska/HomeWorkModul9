public class MyQueue <T>{
    private Node first;
    private Node last;
    private int count;

    public void add(Object value) {

        Node oldLast = last;
        last = new Node();
        last.setValue((T) value);
        if (count == 0) {
            first = last;
        } else {
            oldLast.setNext(last);
        }
        count++;
    }

    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public T peek() {
        if (first == null) {
            return null;
        }
        return (T) first.getValue();
    }

    public T poll() {
        if (first == null) {
            return null;
        }
        Node node = first;
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        count--;
        return (T) node.getValue();
    }

}
