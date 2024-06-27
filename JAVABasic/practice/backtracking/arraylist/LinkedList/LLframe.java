package practice.backtracking.arraylist.LinkedList;

import java.util.LinkedList;

public class LLframe {
    public static void main(String args[]){
        LinkedList<Integer> ll= new LinkedList<>();
// add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        // remove
        ll.remove(2);
        System.out.println(ll);
    }
    
}
