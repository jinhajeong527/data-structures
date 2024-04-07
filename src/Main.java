import com.jjh.hashtables.CharFinder;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CharFinder cf = new CharFinder();
        char ch = cf.findFirstNonRepeatingChar("A green apple");
        System.out.println(ch);
    }
}