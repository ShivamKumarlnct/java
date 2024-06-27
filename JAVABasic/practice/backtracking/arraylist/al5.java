package practice.backtracking.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class al5 {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(1 * i);
        }
        mainList.add(list);
        ArrayList<Integer>list2=new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list2.add(2 * i);
        }
        
        mainList.add(list2);

        ArrayList<Integer> list3= new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list3.add(3 * i);
        }
        mainList.add(list3);
        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>cuArrayList=mainList.get(i);
            for(int j=0;j<cuArrayList.size();j++){
                System.out.print(cuArrayList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
