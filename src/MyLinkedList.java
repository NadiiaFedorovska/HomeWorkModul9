public class MyLinkedList <T>{
    private Node <T> head;
    private Node <T> tail;
    private int count;

    public void add(Object value) {
        Node<T> newNode = new Node<>();
        newNode.setValue((T) value);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        count++;
    }

    public void remove(int index) {
        Node currentNode = getNode(index);
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node prevNode = currentNode.getPrev();
        Node nextNode = currentNode.getNext();
        if (prevNode == null) {
            head = nextNode;
        } else {
            prevNode.setNext(nextNode);
            currentNode.setPrev(null);
        }
        if (nextNode == null) {
            tail = prevNode;
        } else {
            nextNode.setPrev(prevNode);
            currentNode.setNext(null);
        }
        count--;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public int size(){
        if(head == null){
            return 0;
        }
        return count;
    }
    public T get(int index) {
        if (head == null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node<T> search = head;
        for (int i = 0; i < index; i++) {
            search = search.getNext();

            if (search == null){
                throw new IndexOutOfBoundsException("Invalid index: " + index + " , Size: " + size());
            }
        }
        return search.getValue();
    }
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }
}
