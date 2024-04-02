import com.jjh.searching.LinearSearch;
import com.jjh.sorting.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = new int[] {1,5,3,7,8};
        int index1 = linearSearch.search(arr, 7);
        int index2 = linearSearch.search(arr, 6);
        System.out.println("index1:"  + index1);
        System.out.println("index2:" + index2);
    }
}