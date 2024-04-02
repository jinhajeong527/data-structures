import com.jjh.searching.Search;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        int[] arr = new int[] {1,5,3,7,8};
        int index1 = search.linearSearch(arr, 7);
        int index2 = search.linearSearch(arr, 6);
        System.out.println("index1: "  + index1);
        System.out.println("index2: " + index2);
    }
}