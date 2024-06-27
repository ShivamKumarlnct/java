package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;

import java.util.*;

public class identical {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isidentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        }
        if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }
        if(!isidentical(node.left, subroot.left)){
            return false;
        }
        if (!isidentical(node.right, subroot.right)) {
            return false;
        }
        return true;
    }

    public static boolean subtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (isidentical(root, subroot)) {
            return true;
        }
        return subtree(root.left, subroot) || subtree(root.right, subroot);
    }

public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(1);

        System.out.println(subtree(root, subroot));
        }}
