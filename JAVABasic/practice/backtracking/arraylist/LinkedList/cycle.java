package practice.backtracking.arraylist.LinkedList;

public class cycle {
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

    public void addfirst(int data){
      Node newnode= new Node(data);
      if(head==null){
        head=tail=newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next =newnode;
        tail = newnode;
    }
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while(fast!= null && fast.next!= null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =head;

        System.out.println(iscycle());
    }
}
