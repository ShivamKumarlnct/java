package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class valid {
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

    public static boolean isvalid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isvalid(root.left, min, root) && 
        isvalid(root.right, root, max);
    }

    public static void main(String args[]) {
        int val[] = { 1, 1, 1 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();

        if (isvalid(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("not");
        }
    }
}
