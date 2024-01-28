package com.practice.ds.tree.binary_tree.construction;

import com.practice.ds.tree.binary_tree.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Construct BT from array in Level Order Traversal (BFS)
 */
public class BTFromArray {
    public static void main(String[] args) {
        int[] nos = new int[]{1, 2, 3, 4, 5, 6};
        Node root = buildTree(nos);
        printTree(root);
    }

    public static Node buildTree(int[] nos) {
        if (nos.length == 0) {
            return null;
        }
        Node root = new Node(nos[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < nos.length) {
            Node curr = queue.remove();
            if (i < nos.length) {
                curr.setLeft(new Node(nos[i++]));
                queue.add(curr.getLeft());
            }
            if (i < nos.length) {
                curr.setRight(new Node(nos[i++]));
                queue.add(curr.getRight());
            }
        }
        return root;
    }

    public static void printTree(Node root) {
        if (root == null) return;
        printTree(root.getLeft());
        System.out.print(root.getData() + " ");
        printTree(root.getRight());
    }
}
