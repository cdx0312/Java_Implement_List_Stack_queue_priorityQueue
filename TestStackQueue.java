/**
 * Created by cdxu0 on 2017/7/6.
 */
public class TestStackQueue {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Tom");
        System.out.println("(1) " + stack);
        stack.push("Susan");
        System.out.println("(2) " + stack);
        stack.push("Kim");
        stack.push("Michael");
        System.out.println("(3) " + stack);

        System.out.println("(4) " + stack.pop());
        System.out.println("(5) " + stack.pop());
        System.out.println("(6) " +stack);

        System.out.println("\n\n\n");

        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Tom");
        System.out.println("(1) " + queue);
        queue.enqueue("Susan");
        System.out.println("(2) " + queue);
        queue.enqueue("Kim");
        queue.enqueue("Michael");
        System.out.println("(3) " + queue);

        System.out.println("(4) " + queue.dequeue());
        System.out.println("(5) " + queue.dequeue());
        System.out.println("(6) " + queue);

    }
}
