class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        System.out.println("First element = " + stack.peek());
        System.out.println("stack size = " + stack.size());

        System.out.println("stack.pop = " + stack.pop());
        System.out.println("First element after pop = " + stack.peek());

        stack.remove(3);
        System.out.println("stack size after remove = " + stack.size());

        stack.clear();
        System.out.println("stack size after clear = " + stack.size());


    }
}