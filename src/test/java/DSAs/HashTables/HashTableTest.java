package DSAs.HashTables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {
    @Test
    void HashTable_Not_NULL() {
        HashTable<String, String> table = new HashTable<String, String>();
        assertNotNull(table);
    }

    @Test
    void HashTable_Hash_Always_Returns_SameValue() {
        HashTable<String, String> table = new HashTable<String, String>();
        int hashed = table.hash("TestKeyOne");

        for (int i = 0; i < 10; i++) {
            int hashedAgain = table.hash("TestKeyOne");
            if (hashed != hashedAgain)
                assertTrue(false);
        }
        assertTrue(true);
    }

    @Test
    void HashTable_Add_Expected_At_Index_3() {
        HashTable<String, String> table = new HashTable<String, String>();
        table.add("TestKeyOne", "TestValueOne");
        assertTrue(table.getAt(3).Key.equals("TestKeyOne"));
        assertTrue(table.getAt(3).Value.equals("TestValueOne"));
    }

    @Test
    void HashTable_Key_TestKeyOne_Exists() {
        HashTable<String, String> table = new HashTable<String, String>();
        setUpMainHashTable(table);
        assertTrue(table.keyExists("TestKeyOne"));
    }

    @Test
    void HashTable_Key_TestKeyOne_NotExists() {
        HashTable<String, String> table = new HashTable<String, String>();
        assertFalse(table.keyExists("TestKeyOne"));
    }

    @Test
    void HashTable_Key_TestKeyThree_Exists() {
        HashTable<String, String> table = new HashTable<String, String>();
        setUpMainHashTable(table);
        assertTrue(table.keyExists("TestKeyThree"));
    }

    @Test
    void HashTable_Get_Does_Not_Return_NULL() {
        HashTable<String, String> table = new HashTable<String, String>();
        setUpMainHashTable(table);
        assertNotNull(table.get("TestKeyOne"));
        assertNotNull(table.get("TestKeyTwo"));
        assertNotNull(table.get("TestKeyThree"));
        assertNotNull(table.get("TestKeyFour"));
        assertNotNull(table.get("TestKeyFive"));
        assertNotNull(table.get("TestKeySix"));
        assertNotNull(table.get("TestKeySeven"));
        assertNotNull(table.get("TestKeyEight"));
        assertNotNull(table.get("TestKeyNine"));
        assertNotNull(table.get("TestKeyTen"));
        assertNotNull(table.get("TestKeyEleven"));
        assertNotNull(table.get("TestKeyTwelve"));
        assertNotNull(table.get("TestKeyThirteen"));
        assertNotNull(table.get("TestKeyFourteen"));
        assertNotNull(table.get("TestKeyFifteen"));
        assertNotNull(table.get("TestKeySixteen"));
        assertNotNull(table.get("TestKeySeventeen"));
    }

    @Test
    void HashTable_Get_Returns_NULL() {
        HashTable<String, String> table = new HashTable<String, String>();
        assertNull(table.get("TestKeyThree"));
    }

    @Test
    void HashTable_Overrides_Value_Of_Existing_Key(){
        HashTable<String, String> table = new HashTable<String, String>();
        setUpMainHashTable(table);
        assertTrue(table.get("TestKeyOne").Value == "TestValueOne");
        table.add("TestKeyOne", "OverrideTestValueOne");
        assertTrue(table.get("TestKeyOne").Value == "OverrideTestValueOne");
    }

    @Test
    void HashTable_Places_Removed_Key_At_Same_Position(){
        HashTable<String, String> table = new HashTable<String, String>();
        setUpMainHashTable(table);
        int oldPosition = table.indexOf("TestKeyOne");
        table.remove("TestKeyOne");
        table.add("TestKeyOne", "TestValueOneReborn");
        int newPosition = table.indexOf("TestKeyOne");
        assertEquals(oldPosition, newPosition);
    }

    @Test
    void HashTable_Removed_Equals_Null(){
        HashTable<String, String> table = new HashTable<String, String>();
        setUpMainHashTable(table);
        String fiveKey = "TestKeyFive";
        assertNotNull(table.get(fiveKey));
        table.remove(fiveKey);
        assertNull(table.get(fiveKey));
    }

    @Test
    void testing(){
        HashTable<String, String> table = new HashTable<String, String>();
        setUpMainHashTable(table);
        int counter = 0;
        for(int i = 0; i < table.getSize(); i++){
            if(table.getAt(i) != null){
                counter++;
                System.out.println("Counter: " + counter + " -- Table[" + i + "]: " + table.getAt(i).Value);
            }
        }
    }

    void setUpMainHashTable(HashTable<String, String> table){
        table.add("TestKeyOne", "TestValueOne");
        table.add("TestKeyTwo", "TestValueTwo");
        table.add("TestKeyThree", "TestValueThree");
        table.add("TestKeyFour", "TestValueFour");
        table.add("TestKeyFive", "TestValueFive");
        table.add("TestKeySix", "TestValueSix");
        table.add("TestKeySeven", "TestValueSeven");
        table.add("TestKeyEight", "TestValueEight");
        table.add("TestKeyNine", "TestValueNine");
        table.add("TestKeyTen", "TestValueTen");
        table.add("TestKeyEleven", "TestValueEleven");
        table.add("TestKeyTwelve", "TestValueTwelve");
        table.add("TestKeyThirteen", "TestValueThirteen");
        table.add("TestKeyFourteen", "TestValueFourteen");
        table.add("TestKeyFifteen", "TestValueFifteen");
        table.add("TestKeySixteen", "TestValueSixteen");
        table.add("TestKeySeventeen", "TestValueSeventeen");
    }
}
