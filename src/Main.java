import com.jjh.hashtables.HashTable;
import com.jjh.searching.Search;


public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int index = search.ternarySearch_recursive(arr, 3);
        System.out.println(index);
    }
}