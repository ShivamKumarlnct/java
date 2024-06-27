package practice;
import java.util.*;
public class prec {
    public static void main(String arg[]){
    System.out.println("Enter size of array");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int sum=0;
    int array[]=new int[size];
    
    System.out.println("enter array element");
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    for(int i=0;i<array.length;i++){
        // System.out.print(array[i]+" ");
        if(array[i]%2==0){
            sum=sum+array[i];
        }
    }
        System.out.println("even number:"+sum);
    

    }
}
