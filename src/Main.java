import com.jjh.tries.Trie;


public class Main {
    public static void main(String[] args) {
        System.out.println(Trie.longestCommonPrefix(new String[]{"car", "card"}));
        System.out.println(Trie.longestCommonPrefix(new String[]{"car", "care"}));
        System.out.println(Trie.longestCommonPrefix(new String[]{"car", "bar"}));
        System.out.println(Trie.longestCommonPrefix(new String[]{"care", "carefree"}));
    }
}