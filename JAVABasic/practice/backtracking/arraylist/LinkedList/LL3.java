package practice.backtracking.arraylist.LinkedList;

public class LL3 {
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

    // Remove the first node from the linked list
    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove the last node from the linked list
    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // -------------------------------------
    public int itrsearch(int key){
        Node temp=head;
        int i = 0;

        while(temp != null){
            if(temp.data==key){
                return i;
            }
            else{
                temp=temp.next;
                i++;
                
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        LL3 ll = new LL3();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);

        ll.print();

        ll.removefirst();
        ll.print();

        ll.removelast();
        ll.print();

        System.out.println("index of key:"+ll.itrsearch(4));
        System.out.println("key not exist:"+ll.itrsearch(10));
    }
}
