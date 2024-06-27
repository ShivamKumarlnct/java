import java.util.Scanner;

public class function {
    //Q1
    public static void printheeloworld(){//function name=printhelloworld all code write in the class in function
        System.out.println("hello");//not use retun because void is empty,return is use int,..
        System.out.println("world");
    }
    //Q2
    public static void calculate(int a,int b){
        int sum=a+b;
        System.out.println("sum="+sum);

    }
    public static void main(String args[]){//in the main function is use for call
        printheeloworld();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculate(a,b);
    }
    
}
