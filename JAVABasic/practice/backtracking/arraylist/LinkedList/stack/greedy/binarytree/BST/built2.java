package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class built2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
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
        else{
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
    
    public static void main(String args[]){
        int val[]={11,2,13,4,15,6,7,8,9,110};
        Node root=null;
            for(int i=0;i<val.length;i++){
                root=insert(root, val[i]);
            }
            inorder(root);
            System.out.println();
    }
    
}
