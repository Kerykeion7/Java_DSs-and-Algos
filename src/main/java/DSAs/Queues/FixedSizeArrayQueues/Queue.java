package DSAs.Queues.FixedSizeArrayQueues;

import java.util.Iterator;

import DSAs.Vectors.CustomArrayIterator;

public class Queue<T> implements Iterable<T> {
    private T[] _items;
    private int length = 0;
    private int maxCap = 6;

    public Queue(){
        @SuppressWarnings("unchecked")
        T[] items = (T[])new Object[maxCap];
        _items = items;
    }

    public int getSize(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public boolean isFull(){
        return length == maxCap;
    }

    public void enqueue(T value){
        if(isFull()){
            System.out.println("Max capacity is reached.");
            return;
        }

        _items[length] = value;
        length++;
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("Cannot dequeue an empty queue.");
            return null;
        }

        T oldVal = _items[0];
        length--;
        @SuppressWarnings("unchecked")
        T[] items = (T[])new Object[maxCap];
        for(int i = 0; i < maxCap; i++){
            if(i == length) break;
            items[i] = _items[i + 1];
        }
        _items = items;

        return oldVal;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomArrayIterator<T>(_items);
    }
}
