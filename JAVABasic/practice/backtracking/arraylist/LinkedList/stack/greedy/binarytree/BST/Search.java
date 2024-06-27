package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class Search {
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
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data== key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static void main(String args[]){
            int val[]={5,4,1,2,3,7};
            Node root=null;
            int key=6;

            for(int i=0;i<val.length;i++){
                root=insert(root, val[i]);
            }
            inorder(root);
            System.out.println();
            if(search(root, key)){
                System.out.println("found");
            }
            else{
                System.out.println("no found ");
            }

            




    }
    
}
