package practice;
public class problems11 {
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        if(sum>max){
        System.out.println("find the max subarray:"+sum);
        }
    }
    
}
