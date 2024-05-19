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
        List<String> result = trie.findWords("cargo");
        List<String> result2 = trie.findWords(null);
        System.out.println(result2);
    }
}