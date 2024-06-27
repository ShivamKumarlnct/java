package practice.recursion;

public class problem7 {//find the sorted
    public static boolean Sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1])
{
       return false;
}
   return Sorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={2,13,4,7,9};
        int i=0;
        System.out.println(Sorted(arr,0));
    }
    
}
