package DSAs.Vectors;

import java.util.Iterator;

public class CustomArrayIterator<T> implements Iterator<T>{
    T[] _items;
    int index;

    public CustomArrayIterator(T[] items){
        _items = items;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index == _items.length) return false;

        return _items[index] != null;
    }

    @Override
    public T next() {
        T current = _items[index];
        index++;
        return current;
    }
}
