package practice.backtracking.arraylist.LinkedList;

public class removeN {
    public static class Node {
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
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void removeNth(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while (i<itofind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String args[]){
        removeN ll=new removeN();
        ll.addfirst(6);
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
            ll.print();
            ll.removeNth(3);
            ll.print();
    }
    
}
