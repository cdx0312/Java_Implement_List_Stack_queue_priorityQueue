import java.util.Iterator;

/**
 * Created by cdxu0 on 2017/7/5.
 */
public class MyLinkedList<E> extends MyAbstractList<E> {
    private Node<E> head, tail;

    public MyLinkedList() {
    }

    public MyLinkedList(E[] objects) {
        super(objects);
    }

    public E getfirst() {
        if (size == 0)
            return null;
        else
            return head.elemet;
    }

    public E getlast() {
        if (size == 0)
            return null;
        else
            return tail.elemet;
    }
    public void addFirst(E e) {
        Node<E> newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        tail.next = newNode;
        tail = newNode;
        size++;
        if (head == null)
            head = tail;
    }

    @Override
    public void add(int index, E e){
        if (index == 0)
            addFirst(e);
        else if (index >= size)
            addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            current.next.next = temp;
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0)
            return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null)
                tail = null;
            return temp.elemet;
        }
    }

    public E removeLast() {
        if (size == 0)
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.elemet;
        } else {
            Node<E> temp = head;
            for(int i = 0; i < size - 2; i++)
                temp = temp.next;
            Node<E> eNode = tail;
            tail =temp;
            tail.next = null;
            size--;
            return eNode.elemet;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else  {
            Node<E> previous = head;
            for (int i = 1; i < index; i++)
                previous = previous.next;
            Node<E> current = previous.next;
            previous.next = previous.next.next;
            size--;
            return current.elemet;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            result.append(current.elemet);
            current = current.next;
            if (current != null)
                result.append(", ");
            else
                result.append("]");
        }
        return result.toString();
    }

    @Override
    public void clear() {
        size = 0;
        head=tail=null;
    }

    @Override
    public boolean contains(E e) {
        if (size==0)
            return false;
        Node<E> current = head;
        for (int i = 0; i < size; i++){
            if (current.elemet.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return getfirst();
        else if (index == size-1)
            return getlast();
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
            return current.elemet;
        }

    }

    @Override
    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (e.equals(current.elemet))
                return i;
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> current = head;
        int result = 0;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (e.equals(current.elemet)){
                result = i;
                flag = true;
            }
            current = current.next;
        }
        if (flag)
            return result;
        else
            return -1;
    }

    @Override
    public E set(int index, E e) {
        if (index < 0 || index >= size)
            return null;
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        E temp = current.elemet;
        current.elemet = e;
        return temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;
        @Override
        public boolean hasNext() {
            return(current != null);
        }
        @Override
        public E next() {
            E e = current.elemet;
            current = current.next;
            return e;
        }
        @Override
        public void remove() {
            MyLinkedList.this.remove(current.elemet);
        }
    }
    private static class Node<E> {
        E elemet;
        Node<E> next;

        public Node(E e) {
            this.elemet = e;
        }
    }
}


