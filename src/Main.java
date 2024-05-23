import com.jjh.tries.Trie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("careful");
        trie.remove("egg");
        System.out.println(trie.containsRecursive("egg"));
    }
}