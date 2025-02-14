package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class largest {
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

    static class INfo {
        boolean isBST;
        int size;
        int min;
        int max;

        public INfo(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static INfo largest(Node root) {
        if (root == null) {
            return new INfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        INfo left = largest(root.left);
        INfo right = largest(root.right);

        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if(root.data<=left.max ||root.data >= right.min){
        return new INfo(false, size, min, max);
                }

        if (left.isBST && right.isBST) {
            maxBST = Math.max(maxBST, size);
            return new INfo(true, size, min, max);
        }
        return new INfo(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largest(root);
        System.out.println("Size of the largest BST: " + maxBST);
    }
}
