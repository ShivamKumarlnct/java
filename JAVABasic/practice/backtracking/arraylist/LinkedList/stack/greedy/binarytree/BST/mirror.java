package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class mirror {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    public static Node mirror(Node root){
      
        // Node mirror(root);
       if(root==null){
        return null;
       }

        Node left=mirror(root.left);
        Node right=mirror(root.right);

        root.right=left;
        root.left=right;

        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

       root= mirror(root);
       preorder(root);

      


    }
    
}
