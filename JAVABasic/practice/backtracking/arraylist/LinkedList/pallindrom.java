package practice.backtracking.arraylist.LinkedList;

public class pallindrom {
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
    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
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
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean pallindroms(){
        if(head == null || head.next == null){
            return true;
        }
        // step1 find mid
        Node mid=findmid(head);
        // step2
        Node curr = mid;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // step3
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String args[]){
        pallindrom ll=new pallindrom();
        ll.addlast(1);
        ll.addlast(3);
        ll.addlast(3);
        ll.addlast(1);
        ll.print();
        System.out.println(ll.pallindroms());
    }
    
}
