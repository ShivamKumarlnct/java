public class Binarytodecimal {//change binary to decimal
    // public static void change(int n){
    //     int pow=0;
    //     int decNUM=0;
           
    //     while(n>0){
    //         int lastdigit=n%10;
    //         decNUM=decNUM + (lastdigit *(int)Math.pow(2,pow));
    //         pow++;
    //         n=n/10;
           
    //     }
    //         System.out.println("BInary number="+decNUM);
    // }
    //Q2 decimal to binary
    public static void Change(int decimal){
        int pow=0;
        int bin=0;
        int mynum=decimal;
        while(decimal>0){
          int rem=decimal%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
            decimal=decimal/2;
        }
            System.out.println("Decimal="+ mynum +"=binary="+bin);
         }
    public static void main(String args[]){
        // int n=1011;
        int decimal=10;
        Change(decimal);
    }
    
}
