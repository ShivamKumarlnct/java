package practice.backtracking;

public class backt5 {
    public static int NUMways(int row,int col,int n,int m){
        // base case
        if(row==n-1&&col==m-1){
            return 1;
        }else if(row==n||col==m){
            return 0;
        }
       int w1= NUMways(row+1, col, n, m);
       int w2= NUMways(row, col+1, n, m);
       return w1+w2;
    }
    public static void main(String args[]){
        int n=3;int m=3;
        NUMways(0,0,n,m);
        System.out.println("total number of ways:"+NUMways(0, 0, n, m));

    }
    
}
