package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.BST;

public class balanced {
    static class Node{
        int  data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void perorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        perorder(root.left);
        perorder(root.right);
    }
    public static Node balance(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root =new Node(arr[mid]);
        root.left=balance(arr, st, mid-1);
        root.right=balance(arr, mid+1, end);

        return root;
    }

    public static void main(String args[]){
        int arr[]={3,5,6,8,10,11,12};

      Node root=balance(arr, 0, arr.length-1);
      perorder(root);

    }
    
}
