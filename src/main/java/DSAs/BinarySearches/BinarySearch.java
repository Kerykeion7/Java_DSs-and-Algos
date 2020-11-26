package DSAs.BinarySearches;

import java.util.Arrays;

public class BinarySearch {
    public static Integer indexOf(int[] array, int searchValue){
        Arrays.sort(array);
        return findIndex(array, 0, array.length, searchValue);
    }

    private static Integer findIndex(int[] array, int left, int right, int searchValue){
        int mid = (int)((right - left) / 2);
        if(mid <= left) mid += left;
        int val = array[mid];

        if(searchValue < val) return findIndex(array, left, mid, searchValue);
        if(searchValue > val) return findIndex(array, mid, right, searchValue);

        if(val == searchValue) return mid;
        return -1;
    }
}
