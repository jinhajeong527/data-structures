import com.jjh.tries.Trie;


public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("car");
        trie.insert("card");
        trie.insert("care");
        trie.insert("careful");
        trie.insert("egg");
        trie.insert("eggplant");
        trie.insert("donut");
        System.out.println(trie.countWords());
    }
}