import java.util.*;
import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int sum=0;
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("is prime:");
        }
        else{
            System.out.println("is not prime");
        }
    }
    }
    // public static void prime(int n){
    //     boolean isprime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isprime=false;
    //         }
    //     }
    // }
    
    //     public static void printprime(int n){
    //         for(int i=2;i<=n;i++){
    //             if(isprime(i)){
    //                 System.out.println(i); 
    //             }
    //         }
    //     }
    
    // public static void main(String args[]){
    //     int n=10;
    //    prime(n);
    //     int sum=0;
    //     for(int i=2;i<=n;i++){
    //         sum=sum+i;
    //     }
    //         System.out.println( " "+sum);
        
    // }
}
