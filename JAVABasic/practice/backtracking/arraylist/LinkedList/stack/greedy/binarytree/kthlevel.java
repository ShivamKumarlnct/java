package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class kthlevel {
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

    public static void kth(Node root, int k) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            if (level == k) {
                for (int i = 0; i < size; i++) {
                    Node current = q.poll();
                    System.out.print(current.data + " ");
                }
                return;
            }

            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 2; 
        kth(root, k);
    }
}
