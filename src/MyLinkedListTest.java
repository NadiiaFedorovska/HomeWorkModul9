class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        System.out.println("list.size() = " + list.size());

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        System.out.println("list.size() = " + list.size());

        for (int i = 0; i< list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }

        list.remove(2);
        //System.out.println(list.get(2));
        for (int i = 0; i< list.size(); i++) {
            System.out.println("list after remove.get(" + i + ") = " + list.get(i));
        }
        list.clear();
        System.out.println("list.size after clear= " + list.size());
    }
}