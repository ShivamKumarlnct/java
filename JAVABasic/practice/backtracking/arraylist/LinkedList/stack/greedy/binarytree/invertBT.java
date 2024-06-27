package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;

import java.util.*;

public class invertBT {
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

    public static Node inverted(Node node) {
        if (node == null) {
            return node;
        }
        Node left = inverted(node.left);
        Node right = inverted(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root = inverted(root); 
        inorder(root);
    }
}
