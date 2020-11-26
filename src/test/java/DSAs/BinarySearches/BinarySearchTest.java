package DSAs.BinarySearches;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class BinarySearchTest {
    @Test
    void testA(){
        int[] arr = {6, 1, 6, 8, 11, 2, 105, 15, 67,  30, 9, 101, 12, 5};
        assertEquals(3, BinarySearch.indexOf(arr, 6));
        assertEquals(0, BinarySearch.indexOf(arr, 1));
        assertEquals(5, BinarySearch.indexOf(arr, 8));
        assertEquals(7, BinarySearch.indexOf(arr, 11));
        assertEquals(1, BinarySearch.indexOf(arr, 2));
        assertEquals(13, BinarySearch.indexOf(arr, 105));
        assertEquals(9, BinarySearch.indexOf(arr, 15));
        assertEquals(11, BinarySearch.indexOf(arr, 67));
        assertEquals(10, BinarySearch.indexOf(arr, 30));
        assertEquals(6, BinarySearch.indexOf(arr, 9));
        assertEquals(12, BinarySearch.indexOf(arr, 101));
        assertEquals(8, BinarySearch.indexOf(arr, 12));
        assertEquals(2, BinarySearch.indexOf(arr, 5));
    }

    @Test
    void testB(){
        int[] arr = {5, 10, 13, 21, 25, 35, 42, 68, 69, 72, 73, 76, 85, 99, 101, 102, 111, 209, 235, 333};
        assertEquals(Arrays.binarySearch(arr, 5), BinarySearch.indexOf(arr, 5));
        assertEquals(Arrays.binarySearch(arr, 10), BinarySearch.indexOf(arr, 10));
        assertEquals(Arrays.binarySearch(arr, 13), BinarySearch.indexOf(arr, 13));
        assertEquals(Arrays.binarySearch(arr, 21), BinarySearch.indexOf(arr, 21));
        assertEquals(Arrays.binarySearch(arr, 25), BinarySearch.indexOf(arr, 25));
        assertEquals(Arrays.binarySearch(arr, 35), BinarySearch.indexOf(arr, 35));
        assertEquals(Arrays.binarySearch(arr, 42), BinarySearch.indexOf(arr, 42));
        assertEquals(Arrays.binarySearch(arr, 68), BinarySearch.indexOf(arr, 68));
        assertEquals(Arrays.binarySearch(arr, 69), BinarySearch.indexOf(arr, 69));
        assertEquals(Arrays.binarySearch(arr, 72), BinarySearch.indexOf(arr, 72));
        assertEquals(Arrays.binarySearch(arr, 73), BinarySearch.indexOf(arr, 73));
        assertEquals(Arrays.binarySearch(arr, 76), BinarySearch.indexOf(arr, 76));
        assertEquals(Arrays.binarySearch(arr, 85), BinarySearch.indexOf(arr, 85));
        assertEquals(Arrays.binarySearch(arr, 99), BinarySearch.indexOf(arr, 99));
        assertEquals(Arrays.binarySearch(arr, 101), BinarySearch.indexOf(arr, 101));
        assertEquals(Arrays.binarySearch(arr, 102), BinarySearch.indexOf(arr, 102));
        assertEquals(Arrays.binarySearch(arr, 111), BinarySearch.indexOf(arr, 111));
        assertEquals(Arrays.binarySearch(arr, 209), BinarySearch.indexOf(arr, 209));
        assertEquals(Arrays.binarySearch(arr, 235), BinarySearch.indexOf(arr, 235));
        assertEquals(Arrays.binarySearch(arr, 333), BinarySearch.indexOf(arr, 333));
    }
}
