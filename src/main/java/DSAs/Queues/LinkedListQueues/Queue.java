package DSAs.Queues.LinkedListQueues;

import java.util.Iterator;
import DSAs.LinkedLists.*;

public class Queue<T> implements Iterable<SinglyLinkedNode<T>> {
    public SinglyLinkedNode<T> Head;
    public SinglyLinkedNode<T> Tail;
    private int length = 0;

    public int getSize() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(T value) {
        SinglyLinkedNode<T> node = new SinglyLinkedNode<T>();
        node.Value = value;
        node.Next = null;

        if (isEmpty()) Head = node;
        else Tail.Next = node;

        Tail = node;
        length++;
    }

    public T dequeue(){
        if(isEmpty()) {
            System.out.println("Cannot dequeue an emty queue");
            return null;
        }

        T oldVal = Head.Value;
        Head = Head.Next;

        length--;
        return oldVal;
    }

    @Override
    public Iterator<SinglyLinkedNode<T>> iterator() {
        return new SinglyLinkedListIterator<T>(Head);
    }
}
