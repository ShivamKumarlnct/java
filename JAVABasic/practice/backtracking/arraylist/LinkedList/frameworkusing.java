package practice.backtracking.arraylist.LinkedList;
import java.util.*;
public class frameworkusing {
    public static void main(String args[]){
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
       
        Collections.reverse(ll);
        System.out.println(ll);    
        
        ll.add(4,5);
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        
    }
    
}
