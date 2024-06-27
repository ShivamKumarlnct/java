package sortingalgorithms.Stringassignment.bitmanipulation;

public class bitassignment {
    //find the x^x
    // public static int xor(int n){
    //     return n^n;
    // }
    // public static void main(String args[]){
    // System.out.println(xor(3));
    // }
    //find swap two number without using third variable

    public static void main(String args[]){
        int x=3;int y=4;int z=2;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x is:" + x+ " y is:" +y);
        //add 1 in any number
        System.out.println(-~z);//using 1's compliment
        //convert upper case to lower case
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch| ' '));//using | or
        }
    }
}
