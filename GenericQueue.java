import java.util.LinkedList;

/**
 * Created by cdxu0 on 2017/7/6.
 */
public class GenericQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E e) {
        list.add(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize(){
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}
