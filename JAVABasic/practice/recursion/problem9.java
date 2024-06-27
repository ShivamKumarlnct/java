package practice.recursion;

public class problem9 {
    public static int lastocc(int arr[],int key,int idx){
        if(idx==0){
            return 1;}
       if(arr[idx]==key){
        return idx;
       }
       return lastocc(arr, key, idx-1);
        }
    
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,2,11};
        int key=10;
        int idx;
        lastocc(arr,key,9);
        System.out.println(lastocc(arr, key, 9));
    }
    
}
