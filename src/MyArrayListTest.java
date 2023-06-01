class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>();
        for (int i = 1; i < 12; i++) {
            array.add(i);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.printf("%s ", array.get(i));
        }

        System.out.println("\narray size = " + array.size());

        array.remove(5);
        System.out.println("removed 5 element");

        for (int i = 0; i < array.size(); i++) {
            System.out.printf("%s ", array.get(i));
        }

        array.clear();
        System.out.println("\narray size after clear = " + array.size());
    }
}