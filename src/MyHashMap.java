public class MyHashMap<T> {
    private final int DEFAULT_CAPACITY = 16;
    private NodeForHashMap[] buckets;
    private int size;

    public MyHashMap() {
        this.buckets = new NodeForHashMap[DEFAULT_CAPACITY];
    }

    public void put(Object key, Object value) {
        int index = getIndex(key);
        NodeForHashMap head = buckets[index];
        for (NodeForHashMap current = head; current != null; current = current.next) {
            if (current.getKey().equals(key)) {
                current.setValue(value);
                return;
            }
        }
        NodeForHashMap newNode = new NodeForHashMap(key, value);
        newNode.next = head;
        buckets[index] = newNode;
        size++;
    }

    private int getIndex(Object key) {
        return key.hashCode() % buckets.length;
    }

    public Object get(Object key) {
        int index = getIndex(key);
        NodeForHashMap head = buckets[index];
        for (NodeForHashMap current = head; current != null; current = current.next) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
        }
        return null;
    }

    public void remove(Object key) {
        int index = getIndex(key);
        NodeForHashMap head = buckets[index];
        if (head == null) {
            return;
        }
        if (head.getKey().equals(key)) {
            buckets[index] = head.next;
            size--;
            return;
        }
        for (NodeForHashMap prev = head, current = head.next; current != null;
             prev = current, current = current.next) {
            if (current.getKey().equals(key)) {
                prev.next = current.next;
                size--;
                return;
            }
        }
    }

    public void clear() {
        buckets = new NodeForHashMap[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }
}


