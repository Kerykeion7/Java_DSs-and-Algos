package DSAs.LinkedLists;
import java.util.Iterator;

public class SinglyLinkedListIterator<T> implements Iterator<SinglyLinkedNode<T>>{
    SinglyLinkedNode<T> _node;
    public SinglyLinkedListIterator(SinglyLinkedNode<T> node){
        _node = node;
    }

    @Override
    public boolean hasNext() {
        return _node != null;
    }

    @Override
    public SinglyLinkedNode<T> next() {
        SinglyLinkedNode<T> current = _node;
        _node = _node.Next;
        return current;
    } 
}
