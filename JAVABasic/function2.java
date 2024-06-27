import java.util.*;
public class function2 {
    // public static int product(int a,int b){
    //     int product=a*b;
    //     System.out.println(product);
    
    // return product;}
    public static int factorial(int x){
        int f=1;
    for(int i=1;i<=x;i++){
        f=f*i;        
    }
       return f;
    }
    public static void Biocoff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        System.out.println(fact_n/(fact_r)*(fact_nmr));
    }
    public static void main(String args[]){
        //Q1 product of two number
        // Scanner.Sc=new Scanner(System.in);
        // int a=10;int b=5;
        // product(a,b);

        //Q2 factorial
        // int x=5;
        Biocoff(5,4);
       System.out.println(factorial(5)); 
        

    }
    
}
