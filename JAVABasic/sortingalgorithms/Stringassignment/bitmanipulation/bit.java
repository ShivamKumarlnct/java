package sortingalgorithms.Stringassignment.bitmanipulation;
import java.util.*;
public class bit {


    // public static void main(String args[]){
        // System.out.println(5&6);//AND bit-manipulation(A.B)
        // System.out.println(5|6);//OR bit-manipulation(A+B)
        // System.out.println(5^6);//XOR bit-manipulation
        // System.out.println(~7);
        // System.out.println(6<<3);
        // System.out.println(6>>1);    
    // }
    //find the odd or even
    // public static void evenorodd(int n){
    //     int bitmask=1;
    //     if((n&bitmask)==0){
    //         System.out.println("even");
    //     }
    //     else{
    //         System.out.println("odd");
    //     }
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     evenorodd(n);
    // }

    //find the get ith value
    public static int get(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int set(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clear(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int update(int n,int i,int newbit){
        if(newbit==0){
            return clear(n,i);
        }
        else{
            return set(n,i);
        }
    }
    public static int clearlast(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;

    }
    public static int rangeclear(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;

    }
    public static boolean powerornot(int n){
        return (n&(n-1))==0;
    }
    public static int countset(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
          count++;
        }
        n=n>>1;
        }
        return count;
        
    }
    public static int fast(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;

        }
        return ans;
    }
    public static void main(String args[]){
        // int n,i,newbit;
        // int n,i,j;
        System.out.println(fast(3,5));
    
    }

}
