package DSAs.LinkedLists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void testNotNull(){
        SinglyLinkedList<Integer> lst = new SinglyLinkedList<>();
        assertNotNull(lst);
    }
}
