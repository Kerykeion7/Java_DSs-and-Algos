package DSAs.LinkedLists;
import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<SinglyLinkedNode<T>> {
    public SinglyLinkedNode<T> First;
    public SinglyLinkedNode<T> Last;

    public int Length = 0;

    public void push_at(T value, int index) {
        if(index < 0 || index > Length) return;
        if(index == 0){
            push_front(value);
            return;
        }
        if(index == Length){
            push_back(value);
            return;
        } 
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>();
        newNode.Value = value;

        SinglyLinkedNode<T> nodeAtGivenIndex = First;
        for(int i = 0; i < index - 1; i++){
            nodeAtGivenIndex = nodeAtGivenIndex.Next;
        }

        SinglyLinkedNode<T> tempNext = nodeAtGivenIndex.Next;
        nodeAtGivenIndex.Next = newNode;
        newNode.Next = tempNext;
        Length++;
    }

    public void push_front(T value){
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>();
        newNode.Value = value;

        if(is_empty()) Last = newNode;

        newNode.Next = First;
        First = newNode;

        Length++;
    }

    public void push_back(T value){
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>();
        newNode.Value = value;

        if(is_empty()) First = newNode;
        
        if(is_empty()) Last = newNode;
        else{
            Last.Next = newNode;
            Last = newNode;
        } 

        Length++;
    }

    public T pop_front(){
        if(is_empty()) return null;
        T oldVal = First.Value;
        First = First.Next;
        Length--;
        return oldVal;
    }

    public T pop_back(){
        if(is_empty()) return null;
        T oldVal = Last.Value;

        SinglyLinkedNode<T> node = First;
        while(node.Next != Last){
            node = node.Next;
        }

        node.Next = null;
        Last = node;
        Length--;
        return oldVal;
    }

    public void remove_at(int index){
        if(is_empty() || index < 0 || index > Length - 1) return;
        if(index == 0){
            pop_front();
            return;
        }
        if(index == Length - 1){
            pop_back();
            return;
        }

        SinglyLinkedNode<T> nodeAtGivenIndex = First;
        SinglyLinkedNode<T> beforeNodeAtGivenIndex = nodeAtGivenIndex;
        for(int i = 0; i < index; i++){
            beforeNodeAtGivenIndex = nodeAtGivenIndex;
            nodeAtGivenIndex = nodeAtGivenIndex.Next;
        }

        beforeNodeAtGivenIndex.Next = nodeAtGivenIndex.Next;
        nodeAtGivenIndex = null;
        Length--;
    }

    public void remove(T value){
        if(is_empty()) return;

        SinglyLinkedNode<T> current = First;
        for(int i = 0; i < Length; i++){
            if(current.Value.equals(value)){
                remove_at(i);
                break;
            }
            current = current.Next;
        }
    }

    public T get_front(){
        if(is_empty()) return null;
        return First.Value;
    }

    public T get_back(){
        if(is_empty()) return null;
        return Last.Value;
    }

    public T get_at(int index){
        if(is_empty() || index < 0 || index > Length - 1) return null;
        SinglyLinkedNode<T> node = First;
        for(int i = 0;i < index;i++){
            node = node.Next;
        }
        return node.Value;
    }

    public T get_at_from_end(int index){
        if(is_empty() || index < 0 || index > Length - 1) return null;
        SinglyLinkedNode<T> node = First;
        int count = Length - index - 1;
        for(int i = 0;i < count;i++){
            node = node.Next;
        }
        return node.Value;
    }

    public int get_size(){
        return Length;
    }

    public boolean is_empty(){
        return Length == 0;
    }

    public void reverse(){
        if(is_empty()) return;

        SinglyLinkedNode<T> previous;
        SinglyLinkedNode<T> current = First;
        SinglyLinkedNode<T> next = current.Next;

        while(next.Next != null){
            previous = current;
            current = next;
            next = current.Next;
            current.Next = previous;
        }

        SinglyLinkedNode<T> tempFirst = First;
        First = Last;
        First.Next = current;
        Last = tempFirst;
        Last.Next = null;
    }

    @Override
    public Iterator<SinglyLinkedNode<T>> iterator() {
        return new SinglyLinkedListIterator<T>(First);
    }
}