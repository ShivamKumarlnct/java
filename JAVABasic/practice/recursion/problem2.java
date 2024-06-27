package practice.recursion;

public class problem2 {
    public static void increasing(int a,int n){
        if(a==n){
            System.out.println(a+" ");
            return;
        }
        System.out.print(a);
        increasing(a+1,n);
       
    }
    public static void main(String args[]){
        int n=10;
        int a=0;
        increasing(a,n);
    }
    
}
