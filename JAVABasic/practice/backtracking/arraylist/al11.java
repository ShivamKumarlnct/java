package practice.backtracking.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class al11 {
    public static int adjc(ArrayList<Integer>list){
        Collections.sort(list);

        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)+1<list.get(i)&&list.get(i)+1<list.get(i)){
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        Collections.sort(list);
        System.out.println(adjc(list));

    }
    
}
