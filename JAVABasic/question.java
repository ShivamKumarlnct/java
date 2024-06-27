import java.util.*;
public class question {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
    //Q1 /find the average of three number
   //  String input=Sc.nextInt();
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        // int avg=(a+b+c)/3;
        // System.out.println("avg"+(a+b+c)/3);

//Q2 find the area of square
// int a=sc.nextInt();
// System.out.println("area:"+a*a);

//Q3 it is gst problem put three items name in float put the 18%gst in the total bill
        float pen=sc.nextFloat();
        float pencile=sc.nextFloat();
        float eraser=sc.nextFloat();
      float  total=pen+pencile+eraser;
        System.out.println("total:"+(pen+pencile+eraser));
        System.out.println("with gst:"+(total+(0.18f*total)));


    }
    
}
