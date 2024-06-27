package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

import practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.inorder;

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
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        if(root.data<val){
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node delete(Node root,int val){
            if(root.data<val){
                root.right=delete(root.right, val);
            }
            else if(root.data>val){
                root.left=delete(root.left, val);
            }
            else{
                if(root.left==null && root.right==null){  //case-1 leaf node
                    return null;
                }
                if(root.left==null){ //case-2 one child
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }
                Node Is=findinordersuccessor(root.right);
                root.data=Is.data;
                root.right=delete(root.right, Is.data);
    }
    return root;

}

    public static Node findinordersuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String args[]){
            int val[]={1,3,4,5,6,8,10,11,14};
           Node root=null;
           for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
           }
           inorder(root);
           root=delete(root, 14);
           System.out.println();
           inorder(root);
    }
    
}
