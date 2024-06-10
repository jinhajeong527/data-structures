import com.jjh.arrays.Array;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array(3);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.removeAt(4);
        arr.print();
    }
}