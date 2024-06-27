package practice.backtracking.arraylist.LinkedList;

public class mergetwoll {
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
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node merge(Node head1,Node head2){
        while(head2!=null){
            Node temp=head1;
            while(temp!=null){
                if(temp==head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
    public static void main(String args[]){
        mergetwoll list=new mergetwoll();
      Node head1,head2;
      head1 = new Node(4);
      head2=new Node(1);

     Node newNode=new Node(2);
     head2.next=newNode;

      newNode=new Node(3);
      head2.next.next=newNode;
        
      newNode=new Node(5);
      head2.next.next.next=newNode;

      newNode=new Node(8);
      head1.next = newNode;
      head2.next.next.next.next = newNode;

      newNode=new Node(6);
      head1.next.next=newNode;
       head1.next.next=null;

       System.out.print("First Linked List: ");
       list.print(head1);
       System.out.println();

       System.out.print("Second Linked List: ");
       list.print(head2);
       System.out.println();

       Node intersection=list.merge(head1, head2);

       if(intersection==null){
        System.out.println("NO intersection");
       }
       else
       {
        System.out.println("intersection:" + intersection.data);
       }
}    
    }
    

