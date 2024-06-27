package practice.recursion;

public class problem15 {
    public static int index(int arr[],int idx,int key){
        if(idx==arr.length){
            return 1;
        }
        if(arr[idx]==key){
            System.out.println(idx);
        }
       return index(arr, idx+1, key);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,7,2,2};
        int key=2;
        index(arr,0,key);
        // System.out.print(index(arr,0,key));
    }
    
}
