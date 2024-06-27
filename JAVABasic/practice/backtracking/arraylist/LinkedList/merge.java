package practice.backtracking.arraylist.LinkedList;

public class merge {
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

public void addFirst(int data){
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
    tail.next = newnode;
    tail = newnode;
}

public void print() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println("null");
}

private Node mid(Node head){
    Node slow=head;
    Node fast=head.next;
    while (fast != null && fast .next != null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
            temp.next = head1;
            head1 = head1.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
        }
        temp = temp.next;
    }

    if (head1 != null) {
        temp.next = head1;
    } 
    else {
        temp.next = head2;
    }
    return mergedLL.next; 
}

 public Node mergesort(Node head){
    if(head==null || head.next==null){
        return head;
    }
    Node middle=mid(head);
    Node righthead=middle.next;
    middle.next=null;

    Node newleft = mergesort(head);
    Node newright=mergesort(righthead);
 
    return merge(newleft ,newright);
}
public static void main(String args[]){
    merge ll=new merge();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.print();

    ll.head=ll.mergesort(ll.head);
    ll.print();


        }

        
    }
