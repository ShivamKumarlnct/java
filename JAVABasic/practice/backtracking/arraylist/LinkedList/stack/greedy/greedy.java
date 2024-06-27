package practice.backtracking.arraylist.LinkedList.stack.greedy;

import java.util.ArrayList;
import java.util.LinkedList;

public class greedy {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,10};

        int maxacitvity=0;
        ArrayList<Integer>ans=new ArrayList<>();
        maxacitvity=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>=lastend){
                maxacitvity++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("maxactivity:"+ maxacitvity);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
    
}
