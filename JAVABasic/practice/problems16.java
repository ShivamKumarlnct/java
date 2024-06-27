package practice;
import java.util.*;

public class problems16 {
    public static int search(int arr[],int idx){
        for (int i = 0; i < arr.length; i++) {
            if (i == idx) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int arr[]={4,5,6,7,0,1,2};
       int result= search(arr, idx);
       System.out.println("find the target:"+result);
            
        }
    }
    

