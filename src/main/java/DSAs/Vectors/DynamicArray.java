package DSAs.Vectors;

import java.util.Iterator;

public class DynamicArray implements Iterable<Object> {
    private int _minCapacity = 4;
    private int _capacity;
    private Object[] _items;

    public int Count = 0;

    public DynamicArray() {
        _capacity = _minCapacity;
        _items = new Object[_capacity];
    }

    public DynamicArray(int capacity) {
        if (capacity < _minCapacity)
            _capacity = _minCapacity;
        else{
            _capacity = capacity;
            _minCapacity = capacity;
        }

        _items = new Object[_capacity];
    }

    public void removeAt(int index){
        int newTracker = 0;
        Object[] newItems = new Object[_capacity];
        for(int i = 0;i < Count;i++){
            if(i == index) continue;

            newItems[newTracker] = _items[i];
            newTracker++;
        }
        _items = newItems;
        Count--;
        resize();
    }

    public void remove(Object value){
        Object[] newItems = new Object[_capacity];
        int newTracker = 0;
        int oldCount = Count;
        for(int i = 0;i < oldCount;i++){
            if(_items[i].equals(value)) {
                Count--;
                continue;
            }

            newItems[newTracker] = _items[i];
            newTracker++;
        }

        _items = newItems;
        resize();
    }

    public void insertAt(int index, Object value){
        resize();
        Object[] oldItems = _items;
        Object[] newItems = new Object[_capacity];
        int oldTracker = 0;
        for(int i = 0;i <= Count;i++){
            if(i == index){
                newItems[i] = value;
                continue;
            }
            newItems[i] = oldItems[oldTracker];
            oldTracker++;
        }
        _items = newItems;
        Count++;
    }

    public void prepend(Object value){
        insertAt(0, value);
    }

    public int indexOf(Object value){
        for(int i = 0; i < Count;i++){
            if(_items[i].equals(value)) return i;
        }
        return -1;
    }

    public void push(Object item) {
        resize();
        _items[Count] = item;
        Count++;
    }

    public Object pop() {
        if(isEmpty()) return null;

        Object poppedValue = _items[Count - 1];
        Count--;
        reshapeItems();
        resize();

        return poppedValue;
    }

    public Object get_at(int index) {
        return _items[index];
    }

    public int length() {
        return Count;
    }

    public int capacity() {
        return _capacity;
    }

    public boolean isEmpty() {
        return Count == 0;
    }

    private void resize() {
        if (Count == _capacity) {
            _capacity *= 2;
            reshapeItems();
        } else if (Count <= (_capacity / 4)) {
            if (_capacity / 2 >= _minCapacity)
                _capacity /= 2;
        }
    }

    private void reshapeItems(){
        Object[] oldItems = _items;
        Object[] newItems = new Object[_capacity];
        for (int i = 0; i < Count; i++) {
            newItems[i] = oldItems[i];
        }
        _items = newItems;
    }

    @Override
    public Iterator<Object> iterator() {
        return new CustomArrayIterator<Object>(_items);
    }
}
