package practice.backtracking.arraylist.LinkedList.queue;
import java.util.*;
public class deq {
    public static void main(String args[]){
            Deque<Integer>dq=new LinkedList<>();
            dq.addFirst(1);
            dq.addFirst(2);
            dq.addFirst(3);
            System.out.println(dq);

            dq.removeFirst();
            System.out.println(dq);
        };
       

    }


