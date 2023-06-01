import java.util.Objects;

public class NodeForHashMap<T, E> {
    private Object key;
    private Object value;
    NodeForHashMap next;

    NodeForHashMap(T key, E value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public NodeForHashMap getNext() {
        return next;
    }

    public void setNext(NodeForHashMap next) {
        this.next = next;
    }
}
