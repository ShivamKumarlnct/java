package practice.backtracking.arraylist.LinkedList.stack.greedy;
import java.util.*;
public class abs {
    public static void main(String args[]){
            int A[]={1,2,3};
            int B[]={2,1,3};

            int minabs=0;
            Arrays.sort(A);
            Arrays.sort(B);

            for(int i=0;i<A.length;i++){
                minabs=Math.abs(A[i]-B[i]);
            }
            System.out.println("mindifference:"+minabs);

    }
    
}
