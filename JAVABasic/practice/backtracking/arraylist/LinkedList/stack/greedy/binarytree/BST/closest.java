package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

import java.util.*;

public class closest {

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

    public static int closestValue(Node root, int key) {
        int closest = root.data;
        while (root != null) {
            if (Math.abs(root.data - key) < Math.abs(closest - key)) {
                closest = root.data;
            }
            if (key < root.data) {
                root = root.left;
            } else if (key > root.data) {
                root = root.right;
            } else {
                break;
            }
        }
        return closest-key;
    }
            
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(20);

        int key = 9;
        int closestValue = closestValue(root, key);
        System.out.println("The closest value difference: " + key + " is " + closestValue);
    }
}
