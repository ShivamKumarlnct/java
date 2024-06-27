package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;

public class transform {
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
            this.data=data;
            this.left=null;;
            this.right=null;
         }
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=transform(root.left);
        int rightsum=transform(root.right);
       int  data=root.data;
            
       int leftchild = root.left == null ? 0 : root.left.data;
       int rightchild = root.right == null ? 0 : root.right.data;

       root.data=leftsum+leftchild+rightsum+rightchild;

       return data;

    }
    public static void preorder(Node root){//it is create tree
        if(root==null){
            return ;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);


    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

            transform(root);
            preorder(root);
    }
}
