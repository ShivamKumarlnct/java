package practice;

public class pract1 {
    public static void inc(int n,int idx){
        if(idx==n){
            return ;
        }
       
        System.out.println(idx);
        inc(n, idx + 1);
    }

    public static void main(String args[]) {
        int n = 5;
        inc(n, 0);
    }

}
