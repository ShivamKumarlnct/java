package practice;
import java.util.*;
public class prec1 {
    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        System.out.println("new value");
        int newvalue=sc.nextInt();
        int firstocc=0;
        int old[]=new int[size];
        int news[]=new int[size];
            System.out.println("element of array");
        for(int i=0;i<news.length;i++){
            news[i]=sc.nextInt();
        }
        System.out.println("old array element");
        for(int i=0;i<old.length;i++){
            old[i]=sc.nextInt();            
        }
        for(int i=0;i<old.length;i++){
            if(news[i]==old[i]&& firstocc==0){
                old[i]=newvalue;
            }
        }
        for(int i=0;i<old.length;i++){
            System.out.print(old[i]+" ");
        }
    }
}
