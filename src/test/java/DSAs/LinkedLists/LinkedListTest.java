package DSAs.LinkedLists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void testNotNull(){
        SinglyLinkedList<Integer> lst = new SinglyLinkedList<>();
        assertNotNull(lst);
    }

    @Test
    void testSize(){
        SinglyLinkedList<Integer> lst = new SinglyLinkedList<>();
        assertTrue(lst.is_empty());
        assertEquals(0, lst.get_size());
        lst.push_front(0);
        lst.push_front(1);
        assertFalse(lst.is_empty());
        assertEquals(2, lst.get_size());
    }

    @Test
    void testGetting(){
        SinglyLinkedList<Integer> lst = setupTestLinkedList();
        assertEquals(lst.get_front(), 2);
        assertEquals(lst.get_at(0), 2);
        assertEquals(lst.get_at(1), 3);
        assertEquals(lst.get_back(), 7);
        assertEquals(lst.get_at_from_end(0), 7);
        assertEquals(lst.get_at_from_end(1), 6);
    }

    @Test
    void testRemoving(){
        SinglyLinkedList<Integer> lst = setupTestLinkedList();
        assertTrue(lst.pop_back() == 7 
        && lst.pop_back() == 6 
        && lst.pop_front() == 2
        && lst.pop_front() == 3
        && lst.Length == 2);

        assertNotNull(lst.get_at(1));
        assertNull(lst.get_at(2));
        lst.remove_at(1);
        assertNull(lst.get_at(1));
        assertFalse(lst.is_empty());
        lst.remove(5);
        assertFalse(lst.is_empty());
        lst.remove(4);
        assertTrue(lst.is_empty());
    }

    @Test
    void testAdding(){
        SinglyLinkedList<Integer> lst = setupTestLinkedList();
        lst.push_back(10);
        lst.push_front(0);
        lst.push_at(1, 1);
        lst.push_at(8, 8);
        lst.push_at(9, 9);
        for(int i = 0; i < lst.Length; i++){
            assertEquals(i, lst.get_at(i));
        }

        int counter = 0;
        for(int i = lst.Length - 1; i >= 0; i--){
            assertEquals(i, lst.get_at_from_end(counter));
            counter++;
        } 

        lst.reverse();

        for(int i = 0; i < lst.Length; i++){
            assertEquals(i, lst.get_at_from_end(i));
        }

        counter = 0;
        for(int i = lst.Length - 1; i >= 0; i--){
            assertEquals(i, lst.get_at(counter));
            counter++;
        } 
    }

    SinglyLinkedList<Integer> setupTestLinkedList(){
        SinglyLinkedList<Integer> lst = new SinglyLinkedList<>();
        lst.push_front(4);
        lst.push_front(3);
        lst.push_front(2);
        lst.push_back(5);
        lst.push_back(6);
        lst.push_back(7);
        return lst;
    }
}
