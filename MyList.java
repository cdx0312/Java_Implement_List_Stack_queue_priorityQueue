/**
 * Created by cdxu0 on 2017/7/4.
 * interface for MyAbstractList, MyArrayList, MyLinkedList
 */
public interface MyList<E> extends Iterable<E> {
    //add an element at the end of the list
    public void add (E e);
    //add an element at index position
    public void add (int index, E e);
    //clear the list
    public void clear();
    //return true if this list contains the element
    public boolean contains(E e);
    //return the element of the specified index
    public E get(int index);
    //return the index of the first matching element in this list.
    //return -1 if no match
    public int indexOf(E e);
    //return true if the list is empty
    public boolean isEmpty();
    //return the index of the last matching element in this list
    //return -1 if no match
    public int lastIndexOf(E e);
    //remove the first first occurrencee of the element e from the list
    //shift any subsequent elements to the left
    //return true if the element is removed
    public boolean remove(E e);
    //remove the element at the specific position in this list.
    //shift any subswquent elements to the left.
    //return the element that was removed from the list
    public E remove(int index);
    //replace the element at the specific position in the list
    //with the specific element abd return the old element
    public Object set (int index, E e);
    //Return the number of elements in the list
    public int size();
}
