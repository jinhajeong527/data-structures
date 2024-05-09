import com.jjh.binarytrees.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.insert(24);
        tree1.insert(7);
        tree1.insert(51);
        tree1.insert(0);
        tree1.insert(23);
        tree1.insert(29);
        tree1.insert(58);
        tree1.insert(36);
        tree1.insert(45);
        tree1.remove(24);
        System.out.println("Done");


        Tree tree2 = new Tree();
        tree2.insert(50);
        tree2.insert(30);
        tree2.insert(60);
        tree2.insert(10);
        tree2.insert(40);
        tree2.insert(70);
        tree2.insert(20);
        tree2.insert(65);
        tree2.remove(60);
        System.out.println("Done");

        Tree tree3 = new Tree();
        tree3.insert(50);
        tree3.insert(30);
        tree3.insert(60);
        tree3.remove(30);
        System.out.println("Done");

        Tree tree4 = new Tree();
        tree4.insert(5);
        tree4.remove(5);
        System.out.println("Done");

    }
}