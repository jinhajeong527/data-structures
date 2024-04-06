import com.jjh.binarytree.Tree;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(6);
        tree.insert(12);
        tree.insert(25);
        tree.insert(33);
        tree.insert(3);
        tree.insert(8);
        tree.traverseLevelOrder();
    }
}