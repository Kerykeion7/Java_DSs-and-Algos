package DSAs.HashTables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {
    @Test
    void HashTable_Not_NULL(){
        HashTable<String, String> table = new HashTable<String, String>();
        assertNotNull(table); 
    }

    @Test
    void HashTable_Hash_Always_Returns_SameValue(){
        HashTable<String, String> table = new HashTable<String, String>();
        int hashed = table.hash("TestKeyOne");

        for(int i = 0; i < 10; i++){
            int hashedAgain = table.hash("TestKeyOne");
            if(hashed != hashedAgain)
                assertTrue(false);
        }
        assertTrue(true);
    }

    @Test
    void HashTable_Add_Expected_At_Index_3(){
        HashTable<String, String> table = new HashTable<String, String>();
        table.add("TestKeyOne", "TestValueOne");
        assertTrue(table.getAt(3).Key.equals("TestKeyOne"));
        assertTrue(table.getAt(3).Value.equals("TestValueOne"));
    }
}
