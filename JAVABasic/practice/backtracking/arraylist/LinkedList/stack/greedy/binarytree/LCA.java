package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree;

public class LCA {
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
    public static Node Lca(Node root,int n1,int n2){
            if(root==null||root.data==n1 ||root.data==n2){
                return root;
            }
            Node leftlca = Lca(root.left, n1, n2);
            Node rightlca = Lca(root.right, n1, n2);

            if(leftlca==null){
                    return rightlca;
            }
            if(rightlca==null){
                return leftlca;
            }
            return root;

    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftht=height(root.left);
        int rightht=height(root.right);
        return leftht+1;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1=4;
        int n2=6;
        System.out.println("lowest common acc:"+Lca(root, n1, n2).data);
        // System.out.println(height(root));

    }
    
}
