package practice.backtracking.arraylist;

public class Overloading {

  int add(int a,int b){
      System.out.println(a+b+1);
    return 0;
  }
  int add(int a,int b,int c){
      System.out.println(a + b + 1+c);
    return 0;
  }
    public static void main(String args[]){
       Overloading obj=new Overloading();
       obj.add(1, 3);
       obj.add(10,20 ,30);

    //    System.out.println("Result of first addition: " + result1);
    //    System.out.println("Result of second addition: " + result2);
    }
  
   
}
