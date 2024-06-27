package practice.backtracking.arraylist;

import java.util.ArrayList;

public class al3 {
    public static void swap( ArrayList<Integer>list,int idx1,int idx2){
for(int idx=0;idx<list.size();idx++){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
}         

    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(4);
        list.add(1);
       int idx1=1;
       int idx2=2;
       System.out.println("normal list:"+list);
       swap(list, 1, 3);
       System.out.println("swap list:"+list);
    }
    
}
