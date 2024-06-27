package practice;

public class pro112 {
    public static void search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={8,6,3,2,4,6,3,2,1,5,2};
        int key=2;
        search(arr,key);
    }
    
}
