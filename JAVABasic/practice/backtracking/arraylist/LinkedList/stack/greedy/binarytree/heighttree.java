package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;
import java.util.*;

public class heighttree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    // ---------------------------------
    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);
       return Math.max(lh, rh)+1;

    }
    // ----------------------------------
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
      return lc+rc+1;
    }
    // ---------------------------------
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }

 public static int diameter1(Node root){
        if(root==null){
    return 0;
}    
int ld=diameter1(root.left);
int lh=height(root.left);
int rd=diameter1(root.right);
int rh=height(root.right);

int self=lh+rh+1;

return Math.max(self,Math.max(ld,rd));

}

static class INfo {
    int diam;
    int ht;

    public INfo(int diam, int ht) {
        this.diam = diam;
        this.ht = ht;
    }
}

public static INfo diameter(Node root) {
    if (root == null) {
        return new INfo(0, 0);
    }

    INfo lInfo = diameter(root.left);
    INfo rInfo = diameter(root.right);

    int finalDiam = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.ht + rInfo.ht + 1);
    int maxHt = Math.max(lInfo.ht, rInfo.ht) + 1;

    return new INfo(finalDiam, maxHt);
}
    public static void main(String args[]){
        Node root = new Node(1);
         root.left = new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.right=new Node(6);

        // System.out.println("height of tree:"+height(root));
        // System.out.println("count of tree:"+count(root));
        // System.out.println("sumof nodes:"+ sum(root));
        // System.out.println("diameter of:"+diameter(root));\
        System.out.println("diameter:" + diameter(root).diam);
        System.out.println("height:" + diameter(root).ht);
    }
    
}
