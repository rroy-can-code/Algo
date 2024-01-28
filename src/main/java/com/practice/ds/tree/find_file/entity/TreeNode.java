package com.practice.ds.tree.find_file.entity;

import java.io.File;

public class TreeNode {
    File data;
    TreeNode left;
    TreeNode right;
    public TreeNode(File data){
        this.data= data;
        this.left= this.right=null;
    }

    public File getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
