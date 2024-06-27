package practice.backtracking.arraylist;
// import java.util.*; all rounder
import java.util.ArrayList;
import java.util.Collections;//this is package of sorting collection

public class al4 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(1);
        System.out.println("normal:"+ list);
            Collections.sort(list);
            System.out.println("acending order:"+ list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("decending oredr:"+ list);
    }
    
}
