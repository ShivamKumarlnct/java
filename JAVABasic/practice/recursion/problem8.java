package practice.recursion;

public class problem8 {
    public static int firstoccurence(int arr[],int key,int idx){
        if(idx==arr.length){
            return 1;
        }
        if(arr[idx]==key){
            return idx;
        }
      return firstoccurence(arr, key, idx+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3,11};
        int key=5;
        int idx;
        firstoccurence(arr,key,0);
        System.out.println(firstoccurence(arr, key, 0));
    }
    
}
