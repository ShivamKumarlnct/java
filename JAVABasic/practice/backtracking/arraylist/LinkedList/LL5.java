package practice.backtracking.arraylist.LinkedList;
import java.util.*;
public class LL5{
    static class Node{
        int data;
        int next;

        public Node(int data){
            this.data=data;
            this.next= null;
        }

        public static Node head;
        public static Node tail;

        public void add(int data){
        Node newnNode=head;
        while(head==null){
            head.next=head;
                head=newnNode;
        }

        }

    }

    public static void main(String args[]){

    }
    
}
