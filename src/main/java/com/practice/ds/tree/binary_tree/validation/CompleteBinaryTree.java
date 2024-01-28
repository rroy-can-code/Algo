package com.practice.ds.tree.binary_tree.validation;

import com.practice.ds.tree.binary_tree.Node;
import com.practice.ds.tree.binary_tree.construction.BTFromArray;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class intends to check if given binary tree is Perfect Or Not
 * All internal nodes have 2 children's except last level which should be filled from as left as possible
 */
public class CompleteBinaryTree {
    public static void main(String[] args) {
        int[] nos = new int[]{1, 2, 3, 4, 5, 6};
        Node root = BTFromArray.buildTree(nos);
        boolean isComplete = isComplete(root);
        print(isComplete);
    }

    static void print(boolean isPerfect) {
        if (isPerfect) {
            System.out.println("Complete");
        } else {
            System.out.println("Not Complete");
        }
    }

    static boolean isComplete(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.getLeft() != null) {
                if (flag) {
                    return false;
                }
                queue.add(curr.getLeft());
            } else {
                flag = true;
            }
            if (curr.getRight() != null) {
                if (flag) {
                    return false;
                }
                queue.add(curr.getRight());
            } else {
                flag = true;
            }
        }
        return true;
    }
}
