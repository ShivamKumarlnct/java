package practice;

public class pact3{
    public static  void reverse(int arr[],int idx,int n){
        if(idx>=n){
            return ;
        }
        int temp=arr[idx];
        arr[idx]=arr[n];
        arr[n]=temp;
    
        reverse(arr,idx+1,n-1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length-1;
        int idx=0;
       reverse(arr, 0, n);
       for(int i=0;i<=n;i++){
        System.out.print(arr[i] +" ");
       }
    }
}
