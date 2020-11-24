package DSAs.Queues;

import org.junit.jupiter.api.Test;

import DSAs.Queues.LinkedListQueues.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListQTest {
    @Test
    void testNotNull(){
        Queue<String> q = new Queue<>();
        assertNotNull(q);
    }

    @Test
    void testSize(){
        Queue<String> q = new Queue<>();
        assertTrue(q.isEmpty() 
        && q.getSize() == 0);

        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");

        assertTrue(!q.isEmpty() 
        && q.getSize() == 3);

        q.enqueue("four");
        q.enqueue("five");
        q.enqueue("six");

        assertTrue(q.getSize() == 6);
    }

    @Test
    void testDequeuing(){
        Queue<Integer> q = new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        assertTrue(q.getSize() == 6);
        q.enqueue(7);
        assertTrue(q.getSize() == 7);
        assertTrue(q.dequeue() == 1 &&
        q.dequeue() == 2
        && q.getSize() == 5);
    }
}
