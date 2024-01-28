package com.practice.ds.tree.binary_tree;

public class Node {

    private final int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
