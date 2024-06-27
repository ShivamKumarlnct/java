package practice.backtracking.arraylist.LinkedList.queue;
import java.util.*;

public class add {
    public static int fact(Queue <Integer> q){//fact or sum
        int fact=1;
        while(!q.isEmpty()){
            q.peek();
             fact= fact * q.remove();
        }
        return fact;

    }
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList <Integer>() ;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        System.out.println(q);       
        System.out.println("fact of all number:"+fact(q));
            
        
    }
    
}
