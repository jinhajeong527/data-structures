import com.jjh.searching.Search;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        int index1 = search.binarySearch_recursive(arr, 8, 0, arr.length-1);
        System.out.println("index1: "  + index1);
    }
}