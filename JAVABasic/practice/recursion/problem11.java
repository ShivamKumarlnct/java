package practice.recursion;

public class problem11 {
    public static int optimizepower(int x,int n){
        if(n==0){
            return 1;
        }
        int optimize=optimizepower(x, n/2)*optimizepower(x, n/2);//even
        if(n%2!=0){//odd
         optimize =x*optimize;
        }
        return optimize;
    }
    public static void main(String args[]){
        int x=10;
        int  n=2;
        optimizepower(x,n);
        System.out.println(optimizepower(x, n));
    }
    
}
