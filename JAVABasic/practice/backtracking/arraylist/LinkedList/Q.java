package practice.backtracking.arraylist.LinkedList;

public class Q {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
       if(head == null){
        head = tail = newNode;
        return;
       }
       newNode.next=head;
       head=newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void push(){
        Node new_node=new Node();
        new_node.data=new_node;


    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void remove(Node head1,int m,int n){

    }
    public static void main(String args[]){
        Node newNode=new Node(1);

    }
    
}
