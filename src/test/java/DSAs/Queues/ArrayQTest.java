package DSAs.Queues;

import org.junit.jupiter.api.Test;

import DSAs.Queues.FixedSizeArrayQueues.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayQTest {
    @Test
    void testNotNull(){
        Queue<String> q = new Queue<>();
        assertNotNull(q);
    }
}
