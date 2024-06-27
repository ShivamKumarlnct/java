package practice.backtracking.arraylist.LinkedList;

public class LL4 {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Head and tail of the linked list
    public static Node head;
    public static Node tail;
    public static int size;
    // Add a node at the beginning of the linked list
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Add a node at the end of the linked list
    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // Print the linked list
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addmiddle(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String args[]){
        LL4 ll=new LL4();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(4);
        ll.addlast(5);
        ll.addmiddle(2, 3);
        ll.print();
    }
}
