package Hasmap;
import java.util.*;

public class countdistinct {
    public static void main(String args[]){
        int nums[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println("ans= "+set.size());
        
    }
    
}
