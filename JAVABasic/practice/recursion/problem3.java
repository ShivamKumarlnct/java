package practice.recursion;

public class problem3 {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        // int fn1=fact(n-1);
        int facts=n*fact(n-1);
        return facts;


    }
    public static void main(String args[]){
        int n=6;
        fact(n);
        System.out.println(fact(n));
    }
    
}
