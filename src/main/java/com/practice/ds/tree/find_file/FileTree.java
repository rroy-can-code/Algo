package com.practice.ds.tree.find_file;

import com.practice.ds.tree.find_file.entity.TreeNode;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class FileTree {
    public static void main(String[] args) {
        String path = "your file path";
        File file = new File(path);

        TreeNode root = new TreeNode(file);
        root = prepareTree1(file, root);
        //preOrder(root);
        printLevelOrder(root);


    }

    static void printLevelOrder(TreeNode root) {
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            printCurrLevel(root, i);
            System.out.println();
        }
    }

    static void printCurrLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.getData() + " ");
        } else if (level > 1) {
            printCurrLevel(root.getLeft(), level - 1);
            printCurrLevel(root.getRight(), level - 1);
        }
    }

    static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        if (root.getLeft() != null) {
            preOrder(root.getLeft());
        }
        if (root.getRight() != null) {
            preOrder(root.getRight());
        }

    }

    static TreeNode prepareTree(File file, TreeNode root) {
        File[] files = file.listFiles();
        int length = files.length;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < length) {
            TreeNode curr = queue.remove();
            if (i < length) {
                curr.setLeft(new TreeNode(files[i++]));
                queue.add(curr.getLeft());
            }
            if (i < length) {
                curr.setRight(new TreeNode(files[i++]));
                queue.add(curr.getRight());
            }
        }

        return root;
    }

    static TreeNode prepareTree1(File file, TreeNode root) {
        File[] files = null;
        if (file.isDirectory()) {
            files = file.listFiles();
        }
        if (files != null && files.length != 0) {
            int i = 0;
            while (i < files.length) {
                if (i < files.length) {
                    root.setLeft(new TreeNode(files[i++]));
                    prepareTree1(root.getLeft().getData(), root.getLeft());
                }
                if (i < files.length) {
                    root.setRight(new TreeNode(files[i++]));
                    prepareTree1(root.getRight().getData(), root.getRight());
                }
            }

        }
        return root;
    }

    static int height(TreeNode root) {
        //Base case
        if (root == null) {
            return 0;
        } else {
            int lh = height(root.getLeft());
            int rh = height(root.getRight());
            if (lh > rh) {
                return (lh + 1);
            } else {
                return (rh + 1);
            }
        }

    }
}
