class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("hashMap.size = " + hashMap.size());
        System.out.println("hashMap.get(2) = " + hashMap.get(2));
        hashMap.remove(2);
        System.out.println("hashMap.get(2) = " + hashMap.get(2));
        hashMap.clear();
        System.out.println("hashMap.size after clear = " + hashMap.size());
    }

}