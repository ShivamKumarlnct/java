package practice.recursion;
public class pro12 {
    public static int way(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=way(n-1);//ver
        int fnm2=way(n-2);//horiz
        int ftotal=fnm1+fnm2;
        return ftotal;
    }
    
    public static void main(String args[]){
        int n=2;
      System.out.println(way(n));  

    }

}