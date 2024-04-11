import com.jjh.searching.Search;


public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10,12};
        int[] arr2 = new int[]{1};
        int[] arr3 = new int[]{};
        int index = search.exponentialSearch(arr3, 112);
        System.out.println(index);
    }
}