package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;

public class delete {
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
    public static Node delete(Node root,int x){
        if(root==null){
            return root;
        }
        Node left=delete(root.left,x);
        Node right=delete(root.right,x);
        if( left.data ==x && left==null &&right==null){
            
        }   
    }
    public static void main(String args[]){

    }
    
}
