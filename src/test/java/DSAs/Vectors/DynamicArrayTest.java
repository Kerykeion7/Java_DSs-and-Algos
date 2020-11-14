package DSAs.Vectors;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicArrayTest {
    @Test
    void DynamicArray_NotNULL_Test(){
        DynamicArray array = new DynamicArray();
        assertNotNull(array);
    }

    @Test
    void DynamicArray_Count_Equals_8(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        assertTrue(array.Count == 8);
    }

    @Test
    void DynamicArrays_Capacity_Equals_MinCapacity(){
        DynamicArray array = new DynamicArray();
        DynamicArray secondArray = new DynamicArray(2);

        assertTrue(array.capacity() == 4);
        assertTrue(secondArray.capacity() == 4);
    }

    @Test
    void DynamicArray_Capacity_Equals_GivenCapacity(){
        DynamicArray array = new DynamicArray(10);
        assertTrue(array.capacity() == 10);
    }

    @Test
    void DynamicArray_IsEmpty(){
        DynamicArray array = new DynamicArray(10);
        assertTrue(array.isEmpty());
    }

    @Test
    void DynamicArray_IsNOTEmpty(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        assertFalse(array.isEmpty());
    }

    @Test
    void DynamicArray_Count_Equals_Length(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        assertTrue(array.Count == array.length());
    }

    @Test
    void DynamicArray_Popped_Equals_Ten(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        assertEquals("Ten", array.pop());
    }

    @Test
    void DynamicArray_Doubles_Size_On_Capacity_Reached(){
        DynamicArray array = new DynamicArray(8);
        SetUpMainTestArray(array);
        int oldCapacity = array.capacity();
        assertTrue(oldCapacity == 8);
        array.push("11");
        assertTrue(array.capacity() == (oldCapacity * 2));
    }

    @Test
    void DynamicArray_Halves_Size_On_Count_Less_Than_Quarter_Of_Capacity(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        int oldCapacity = array.capacity();
        assertTrue(oldCapacity == 8);
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        assertTrue(array.capacity() == (oldCapacity / 2));
    }

    @Test
    void DynamicArray_InsertAt_Equals_IndexOf_5(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        array.insertAt(5, "Six");
        assertTrue(array.indexOf("Six") == 5);
    }

    @Test
    void DynamicArray_Prepend_Equals_IndexOf_0(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        array.prepend(0);
        assertTrue(array.indexOf(0) == 0);
    }

    @Test
    void DynamicArray_RemoveAt5_Removes_7(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        assertTrue(array.get_at(5) == (Integer)7);
        array.removeAt(5);
        assertFalse(array.get_at(5) == (Integer)7);
    }

    @Test
    void DynamicArray_Remove_Ten_Actually_Removes_ALL_Tens(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        array.insertAt(5, "Ten");
        array.push("Ten");
        array.prepend("Ten");
        array.remove("Ten");
        for(Object obj: array){
            if(obj.equals("Ten"))
                assertTrue(false);
        }
        assertTrue(true);
    }

    @Test
    void DynamicArray_Equals_BuiltIn_Array(){
        DynamicArray array = new DynamicArray();
        SetUpMainTestArray(array);
        array.insertAt(5, "Six");
        array.insertAt(8, 9);
        array.prepend("ZERO");

        Object[] actual = new Object[array.Count];

        for(int i = 0; i < array.Count; i++){
            actual[i] = array.get_at(i);
        }

        Object[] expected = {
            "ZERO",
            1,
            "Two",
            "Three",
            4,
            5,
            "Six",
            7,
            "Eight",
            9,
            "Ten"
        };
        assertArrayEquals(expected, actual);
    }

    void SetUpMainTestArray(DynamicArray array){
        array.push(1);
        array.push("Two");
        array.push("Three");
        array.push(4);
        array.push(5);
        array.push(7);
        array.push("Eight");
        array.push("Ten");
    }
}
