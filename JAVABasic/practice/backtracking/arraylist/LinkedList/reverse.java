package practice.backtracking.arraylist.LinkedList;

public class reverse {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // =================first add==========
    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode; // Initialize both head and tail to newNode
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // --------add last---------
    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode; 
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // ------print---------
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ------------reverse---------
    public void reverses() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; 
    }
public void firstremove(){
        head=head.next;
        return;
}



    public static void main(String args[]) {
        reverse ll = new reverse();
        ll.addfirst(1);

        ll.addfirst(2);

        ll.addfirst(3);

        ll.addfirst(4);

        ll.addfirst(5);

        ll.addfirst(6);
        ll.print();
        ll.reverses(); // Reverse the list
        ll.print(); // Print the reversed list
        ll.firstremove();
        ll.print();
        
    }
}
