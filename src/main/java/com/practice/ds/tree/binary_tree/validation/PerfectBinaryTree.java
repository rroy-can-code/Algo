package com.practice.ds.tree.binary_tree.validation;

import com.practice.ds.tree.binary_tree.Node;
import com.practice.ds.tree.binary_tree.construction.BTFromArray;

/**
 * This class intends to check if given binary tree is Perfect Or Not
 * All internal nodes must have 2 children
 */
public class PerfectBinaryTree {
    public static void main(String[] args) {
        int[] nos = new int[]{1, 2, 3, 4, 5, 6, 7};
        Node root = BTFromArray.buildTree(nos);
        boolean isPerfect = isPerfect(root);
        print(isPerfect);

    }

    static void print(boolean isPerfect){
        if (isPerfect) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }

    static boolean isPerfect(Node root, int depth, int level) {
        if (root == null) return true;
        if (root.getLeft() == null && root.getRight() == null) {
            return (depth == level + 1);
        }
        if (root.getLeft() == null || root.getRight() == null) {
            return false;
        }
        return isPerfect(root.getLeft(), depth, level + 1) &&
                isPerfect(root.getRight(), depth, level + 1);
    }

    static boolean isPerfect(Node root) {
        return isPerfect(root, depth(root), 0);
    }

    static int depth(Node root) {
        Node node = root;
        int d = 0;
        while (node != null) {
            d++;
            node = node.getLeft();
        }
        return d;
    }

}
