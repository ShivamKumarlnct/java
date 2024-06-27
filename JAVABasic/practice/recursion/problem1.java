package practice.recursion;

public class problem1 {
    public static void decreasing(int n){
        if(n==1){
            System.out.println(n+"");
        return;
    }
            System.out.print(n+" ");
            decreasing(n-1);
        
    }

    public static void main(String args[]){
        //Q1 print number fomr n to 1 decreasing order
        int n = 10;
        decreasing(n);
       
        // for(int i=10;i>=0;i--){
        //     System.out.print(i+" ");
        // }

        // recursion method
    }
}
