package practice.backtracking.arraylist.LinkedList.stack.greedy;

import java.util.Comparator;
import java.util.*;

public class maxlen {
    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble (o->o[1]));
        int chainlen=1;
        int chainend=pairs[0][1];
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>chainend){
                chainlen++;
                chainend = pairs[i][1];
            }
            // System.out.println(pairs[i][1]);
        }
        System.out.println("find the chain lenght:"+chainlen);

    }
    
}
