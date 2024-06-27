package practice.backtracking;

public class back1 {
    public static void change(int arr[],int idx,int value){
        // base case
        if(idx==arr.length){
            print(arr);
            return;
        }
        arr[idx]=value;
        change(arr, idx+1, value+1);
        arr[idx]=arr[idx]-2;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        change(arr,0,1);
        print(arr);
    }
    
}
