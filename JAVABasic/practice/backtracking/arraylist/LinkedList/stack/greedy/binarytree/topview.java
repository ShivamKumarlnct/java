package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;
import java.util.*;
public class topview {
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
    static class INfo{
        int hd;
        Node node;

        public INfo(Node node,int hd){
            this.hd=hd;
            this.node=node;
        }
    }
    public static void topview(Node root){
        Queue<INfo>q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0;int max=0;
        if(root==null){
            return;
        }
        // leve-order
        q.add(new INfo(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            INfo curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new INfo(curr.node.left,curr.hd-1));
                    min=Math.min(min ,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new INfo(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }
            for(int i=min; i<=max; i++){
                System.out.print(map.get(i).data+" ");
            }
        
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        topview(root);
    }
    
}
