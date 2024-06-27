package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;

public class prac {
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
    static class BinaryTree{
       static int idx=-1;
        public static Node builTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=builTree(nodes);
            newnode.right=builTree(nodes);
            return newnode;

        }
    }
    public static void main(String args[])
{
int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
BinaryTree tree=new BinaryTree();
Node root=tree.builTree(nodes);
System.out.println("root of tree:"+root.data);
}    
}
