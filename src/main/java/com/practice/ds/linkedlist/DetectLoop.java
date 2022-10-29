package com.practice.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {
    static Node head;

    public static void main(String[] args) {
        DetectLoop detectLoop = new DetectLoop();
        detectLoop.add(1);
        detectLoop.add(2);
        detectLoop.add(3);
        detectLoop.add(4);
        head.next.next.next.next = head;

        /*if (detectLoop.detect(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop detected");
        }*/
        detectLoop.countNodesInLoop(head);
    }


    /**
     * count nodes in a loop
     * from slow ptr it will move until it reaches same position
     * @param head
     * @return
     */
    public int countNodes(Node head) {
        Node temp = head;
        int count = 0;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        return count;
    }


    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int countNodesInLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop detected counting nodes !!!!!!!!");
                return countNodes(slow);
            }
        }
        return 0;
    }

    public boolean detect(Node node) {
        Set<Node> set = new HashSet<>();
        while (node != null) {
            if (set.contains(node)) {
                return true;
            }
            set.add(node);
            node = node.next;
        }
        return false;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

}
