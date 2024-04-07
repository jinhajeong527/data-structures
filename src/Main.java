import com.jjh.hashtables.CharFinder;


public class Main {
    public static void main(String[] args) {
        CharFinder cf = new CharFinder();
        char ch = cf.findFirstRepeatedChar("A green apple");
        System.out.println(ch);
    }
}