package practice.backtracking.arraylist;

import java.util.ArrayList;

public abstract class al7 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);        
        System.out.println();
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==5){
                    System.out.println("("+ i+","+ j+")");
                }
            }
        }
    }
    
}
