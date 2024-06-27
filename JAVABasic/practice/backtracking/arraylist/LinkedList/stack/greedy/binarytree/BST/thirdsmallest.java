package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class thirdsmallest {
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

    public static int count = 0;

    public static Node kthSmallest(Node root, int k) {
        if (root == null) {
            return null;
        }

        Node left = kthSmallest(root.left, k);

        if (left != null) {
            return left;
        }

        count++;
        if (count == k) {
            return root;
        }

        return kthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.right.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        int k = 5;
        Node result = kthSmallest(root, k);

        if (result != null) {
            System.out.println("The " + k + "-th smallest value is " + result.data);
        } else {
            System.out.println("There are less than " + k + " nodes in the tree.");
        }
    }
}
