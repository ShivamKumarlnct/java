package practice.backtracking.arraylist.LinkedList;

import java.util.LinkedList;

public class LL2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;//this is curr value refer 
            this.next = null;

        }
    }

    // head and tail
    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

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

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
}
    public static void main(String args[]) {
        LL2 ll = new LL2();
      ll.addFirst(4);
      ll.addFirst(2);
      ll.addFirst(1);
      ll.addlast(5);
      ll.addlast(6);
      ll.add(2, 3);
      ll.print();
System.out.println("size of ll:"+ll.size);
    }
}
