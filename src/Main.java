import com.jjh.tries.Trie;

public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("canada");
        System.out.println(trie.contains("can"));


    }
}