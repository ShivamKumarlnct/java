package practice;

public class problems10 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        
        }
        
    }
    
}
