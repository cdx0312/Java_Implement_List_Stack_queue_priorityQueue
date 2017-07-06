import java.util.ArrayList;

/**
 * Created by cdxu0 on 2017/7/6.
 */
public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<E>();
    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

}
