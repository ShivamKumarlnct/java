package practice;

public class ppp {
    public static void main(String args[]){
    int arr[]={6,3,9,2,4,67,1};
    for(int i=0;i<=arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

}    
}
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
   
}
    
}
