package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class rangesum {
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
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static int sum = 0;

   
    public static int sums(Node root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.data > L && root.data < R) {
            sum += root.data;
        }
        if (root.data > L) {
            sums(root.left, L, R);
        }
        if (root.data < R) {
            sums(root.right, L, R);
        }
        return sum;
    }

    public static void main(String args[]) {
        int val[] = { 3, 5, 6, 8, 11, 20 };
        Node root = null;
        for (int v : val) {
            root = insert(root, v);
        }
        int L = 3;
        int R = 8;

        sum = 0;
        System.out.println(sums(root, L, R));
    }
}
