package DSAs.Queues.LinkedListQueues;

import DSAs.LinkedLists.SinglyLinkedNode;

public class Testing {
    public static void main(String[] args){
        Queue<String> q = new Queue<String>();
        System.out.println(q.getSize());
        System.out.println("No tengo nada? " + q.isEmpty());

        q.enqueue("uno");
        q.enqueue("dos");
        q.enqueue("tres");
        q.enqueue("cuatro");
        q.enqueue("cinco");
        q.enqueue("seis");

        System.out.println(q.getSize());
        System.out.println("No tengo nada? " + q.isEmpty());

        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());
        q.enqueue("hola");

        for(SinglyLinkedNode<String> s: q){
            System.out.println("LOOP NODE VALUE: " + s.Value);
        }
    }
}
