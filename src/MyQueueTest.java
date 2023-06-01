class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println("queue size = " + queue.size());
        for (int i = 1; i < 5; i++) {
            queue.add(i);
        }
        System.out.println("First element = " + queue.peek());
        System.out.println("queue size = " + queue.size());
        System.out.println("First element before delete = " + queue.poll());
        System.out.println("First element after delete = " + queue.peek());
        queue.clear();
        System.out.println("queue size after clear = " + queue.size());
    }
}