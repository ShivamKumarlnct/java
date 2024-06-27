package practice.backtracking.arraylist.LinkedList.stack.greedy;

import java.util.ArrayList;
import java.util.Collections;

import javafx.print.Collation;

public class maxodd {
    public static int odd(int L,int R,int k){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = L; i <= R; i++) {
            if (i % 2 != 0)
                list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        if(k>list.size()){
            return 0;
        }
        if(k>list.size()){
            return 0;
        }
        else{
            return list.get(k-1);
        }
    }
public static void main(String args[]){

        int L=-3,R=3,k=1;
        odd(L, R, k);
        System.out.println(odd(L, R, k));
        

        


    }  
}
