package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;
import java.util.*;
public class kth {
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
    public static void kth(Node root,int level,int k){
        if(root==null){
            return;
        }

        if(level==k){
            System.out.println(root.data);
        }
        kth(root.left, level + 1, k);
        kth(root.right, level + 1, k);
        
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        int k=3;
        int level=1;
            kth(root, 1, 3);
    }
    
}
