import com.jjh.binarytree.Tree;
import com.jjh.searching.Search;


public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("Done");
        System.out.println(tree.find(12)); // false
        System.out.println(tree.find(9));
    }
}