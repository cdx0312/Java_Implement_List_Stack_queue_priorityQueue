import com.sun.org.apache.xalan.internal.xsltc.dom.MultiValuedNodeHeapIterator;

/**
 * Created by cdxu0 on 2017/7/6.
 * 用堆实现，
 * 元素被赋予优先级，最高优先级的元素先出队
 */
public class MyPriorityQueue<E extends Comparable<E>> {
    private Heap<E> heap = new Heap<E>();

    public void enqueue(E e) {
        heap.add(e);
    }

    public E dequeue() {
        return heap.remove();
    }

    public int getSize() {
        return heap.getSize();
    }
}
