package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

import java.util.ArrayList;

public class path {
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

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printpaths(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void printpathleaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printpaths(path);
        }
            printpathleaf(root.left, path);
            printpathleaf(root.right, path);
        

        path.remove(path.size() - 1); 
    }

    public static void main(String[] args) {
        int val[] = { 8, 5, 3, 6, 10, 11, 14 }; 
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();

        printpathleaf(root, new ArrayList<>());
    }
}
