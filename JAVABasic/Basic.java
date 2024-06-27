import java.util.*;
public class Basic {//this question is based on break
    public  static void main(String args[]){
    //     for(int i=1;i<=5;i++){
    //         if(i==3){
    //             break;
    //         }
    //         System.out.println(i);
    //     }
   // Q2 keep entering the till uses ebter a multiple of 10
    Scanner Sc=new Scanner(System.in);
// do{
        // int a=Sc.nextInt();
//         if(a%10==0){
//             break;
//         }
//         System.out.println(a);
//     }
//         while(true);
//     System.out.println("out");

    //Q3 contineous
    // for(int i=1;i<=5;i++){
    //     if(i==3){
    //         continue;
    //     }
    //     System.out.println(i);//it is skip the 3 value
    //Q4 display all number entered by user excep multiples of 10
    do{
                int a=Sc.nextInt();
            if(a%10==0){
                continue;
            }
            System.out.println("number="+a);
        }
            while(true);
        



    
    



    }
    
}
