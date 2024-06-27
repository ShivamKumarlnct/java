package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class range {
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

    public static void printrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
    
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }
        if (root.data > k1) {
            printrange(root.left, k1, k2);
        }
        if (root.data < k2) {
            printrange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int val[] = { 1, 3, 4, 5, 6, 8, 10, 11, 14 };
        int k1 = 5;
        int k2 = 12;
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();
        printrange(root, k1, k2);
    }
}
