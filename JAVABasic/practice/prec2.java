package practice;
import java.util.*;
public class prec2 {
    public static boolean ispallindrom(int n)
{
int rem ,rev=0;
int orinum=n;
while(n>0){
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
return rev==orinum;
}
  public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
            if(ispallindrom(array[i])){
                sum=sum+array[i];
            }
        }
        System.out.println("sum:"+sum);
    }
}
