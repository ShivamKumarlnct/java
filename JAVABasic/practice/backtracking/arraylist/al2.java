package practice.backtracking.arraylist;

import java.util.ArrayList;

public class al2 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(max);

    }
    
}
