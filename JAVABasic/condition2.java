import java.util.*;
public class condition2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int income=sc.nextInt();

        // if(income<500000){
        //     System.out.println("no tax");
        // }
        // else if(income>=500000&&income<1000000){
        //     System.out.println("20%tax="+ income*0.2);

        // }
        // else{
        //     System.out.println("30%tax="+ income*0.3);
        // }
        int a=sc.nextInt();//it is compare 3 numbers
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a>=b)&&(a>=c)){
            System.out.println("A=" +a);
        }
        else if(b>c){
            System.out.println("b=" +b);
        }
        else{
            System.out.println("c="+ c);
        }

    }
    
}
