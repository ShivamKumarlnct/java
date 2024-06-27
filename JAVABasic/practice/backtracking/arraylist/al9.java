package practice.backtracking.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class al9 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
        int target = 5;
    }
    
}
