import com.jjh.binarytree.Tree;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<Integer> list = tree1.getNodesAtDistance(3);
        for (Integer item : list) {
            System.out.println(item);
        }
    }
}