package practice.recursion;

public class problem10 {
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        int xmn=power(x,n-1);
        int xn=x*xmn;
        return xn;
       
    }
    public static void main(String args[]){
        int x=5;
        int n=2;
        
        System.out.println(power(x, n));
    }
    
}
