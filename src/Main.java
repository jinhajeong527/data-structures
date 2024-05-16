import com.jjh.tries.Trie;

public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("car");
        trie.insert("care");
//        trie.remove("care");
//        trie.remove("car");
        trie.remove("book");
        System.out.println(trie.contains("car"));
        System.out.println(trie.contains("care"));
    }
}