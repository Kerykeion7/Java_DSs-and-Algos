package DSAs.Queues.FixedSizeArrayQueues;

public class Testing {
    public static void main(String[] args){
        Queue<Integer> q = new Queue<Integer>();
        System.out.println(q.getSize());
        System.out.println("IS EMPTY? " + q.isEmpty());
        System.out.println("IS FULL? " + q.isFull());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());
        System.out.println("DEQUEUED: " + q.dequeue());

        q.enqueue(7);
        for(int i: q){
            System.out.println("LOOP VALUE: " + i);
        }
    }
}
