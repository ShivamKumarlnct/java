package practice;

public class problem22 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,15};
        for(int i=1;i<arr.length;i++){
            // System.out.print(i+" ");
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print("fizzbuzz" + " ");
            }
           else if(arr[i]%3==0){
        System.out.print("fizz"+" ");
            }
            else if(arr[i]%5==0){
                System.out.print("buzz"+" ");
            }
             
             else{
            System.out.print(arr[i]+" ");
        }
        }
        
    }
    
}
