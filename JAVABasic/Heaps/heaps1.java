package Heaps;
import java.util.*;
public class heaps1 {
    public static void main(String args[]){

        // it is sorted
    PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());

    pq.add(4); //O(n)
    pq.add(1);
    pq.add(7);
    pq.add(2);

    while(!pq.isEmpty()){
        System.out.println(pq.peek()); //O(1)
        pq.remove();
    }
    }
    
}
