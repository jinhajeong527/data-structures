import com.jjh.binarytree.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.insert(20);
        tree1.insert(10);
        tree1.insert(30);
        tree1.insert(6);
        tree1.insert(12);
        tree1.insert(25);
        tree1.insert(33);
        tree1.insert(3);
        tree1.insert(8);

        Tree tree2 = new Tree();
        tree2.insert(20);
        tree2.insert(10);
        tree2.insert(30);
        tree2.insert(6);
        tree2.insert(12);
        tree2.insert(25);
        tree2.insert(33);
        tree2.insert(3);
        tree2.insert(8);
        System.out.println(tree1.equals(tree2));
    }
}