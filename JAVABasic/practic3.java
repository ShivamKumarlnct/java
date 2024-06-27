import java.util.*;
public class practic3 {
    public static void main(String args[]){
        // System.out.println("hello");
        // int n=5;
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int a=10;
        // System.out.println(a);
    //  Scanner sc=new Scanner(System.in);
    //  int a=sc.nextInt();
    // //  int b=sc.nextInt();
    //  System.out.println("this is value of a:"+a);
    //  System.out.println("this is value of b:"+b);
    //  System.out.println("sum:"+ (a+b));
    //  System.out.println( 3.14*a*a);
// float c=sc.nextFloat();
// System.out.println(c);
// char d='a';
// System.out.println((int)(d));


//Q2
// Scanner sc=new Scanner(System.in);
// int num= sc.nextInt();

// if(num<30){
// System.out.println("grade c");
// }
// else if(num==30){
//     System.out.println("grade B");
// }
// else if(num>30){
//     System.out.println("grade A");
// }
// else{
//     System.out.println("fail");
// }


//Q3
// Scanner sc=new Scanner(System.in);
//  int num= sc.nextInt();

//  boolean result=(num>20)? true:false;
//  System.out.println(result);
//    }
// }


// Q4
// Scanner sc=new Scanner(System.in);
//   int num= sc.nextInt();
// int a=4;
// int b=3;
// switch (num) {
//     case 1:
//         System.out.println("a+b:"+ a+b);
//         break;
//         case 2:
//         System.out.println("a/b:"+ a/b);
//         break;
//         case 3:
//         System.out.println("a*b:"+ a*b);
//         break;
//         case 4:
//         System.out.println("a%b:"+ a%b);
//         break;
//     default:
//     System.out.println("not exist");
//         break;
// }

// Q5

// for(int i=1;i<=5;i++){
//     if(i==3)
//         // break; in the break i is stop 3
//         continue;//in continue i is remove the 3
//         // System.out.println(i); 
    
//     System.out.println(i);
// }

// Q6
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// // boolean isprime=true;
// for(int i=2;i<=n-1;i++){
//     if(n%i==0){
// //   isprime=false;
//   System.out.println(i);
//     }
// } 

// if(isprime==true){
//     System.out.println("prime");
// }
// else{
//     System.out.println("is not prime");
// }

// String sen="welcome to mumbai";
// String [] sens=sen.split("");
// for(int i=sen.length()-1;i>=0;i--){
//     System.out.print(sens[i]);
// }

    //     String sen = "my name is shivam";
    //     String[] words = sen.split("\\s+");

    //     for (int i = words.length - 1; i >= 0; i--) {
    //         System.out.print(words[i] + " ");
    //     }

    // print square pattern
    // for(int i=0;i<=4;i++){
    //     System.out.println("*******");
    // }

    // print square pattern
    // for(int i=0;i<=4;i++){
    //     for(int j=0;j<=4;j++){
        
    //     System.out.print("*");
    //     }
    //         System.out.println("");
    // }

    // print triangle
    // for(int  i=0;i<=4;i++){
    //     for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // print triangle 
//     int n=4;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=0;j<i;j++){
// System.out.print("*");
//         }
//         System.out.println();
//     }

// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for(int i=0;i<=n;i++){
//     System.out.println(i);
// }

// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int a=sc.nextInt();
// int b=sc.nextInt();
// int result=(a+b+n)/3;

// System.out.println("this is average of :"+result);


// pattern problem
//  Scanner sc=new Scanner(System.in);
//  int a=sc.nextInt();
//  int b=sc.nextInt();
//  int expresion=sc.nextInt();

//  switch(expresion){
//     case 1:
//     System.out.println("adding:"+ (a+b));
//     break;
//     case 2:
//     System.out.println("subtraction:"+ (a-b));
//     break;
//     case 3:
//     System.out.println("multiplication:"+ (a*b));
//     break;
//     case 4:
//     System.out.println("division:"+ (a/b));
//     break;
//     case 5:
//     System.out.println("modulous:"+ (a%b));
//     break;

//  }
// pattern triangle in oposite
// int n=4;
// char ch='A';
// for(int i=0;i<=n;i++){
//     for(int chars=0;chars<i;chars++){
//         System.out.print(ch);

//     }
//     System.out.println();
// }
// pattern triangle problem
//  for(int i=1;i<=5;i++){
//     for(int j=1;j<=i-1;j++){
//         System.out.print(" ");
//     }
// for(int j=5-i;j>=1;j--){
//     System.out.print("*");
// }
// System.out.println();
//  }
// for(int i=0;i<=6;i++){
//     for(int j=0;j<=6-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=0;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

 
//   ___*
//   __**
//   _***


// int a=3;
//     a=3;
// int b=a;
//     a=b;
//     System.out.println("b=5"+b);

// Q1 decimal to binary
// int n=5;
// int bin=0;
// int pow=0;
// while(n>0){
//     int rem=n%2;
//     bin=bin+(rem*(int)Math.pow(10,pow));
//     pow++;
//     n=n/2;
// }
//         System.out.println(bin);

// Q-2 binary to decimal
// int n=1101;
// int dec=0;
// int pow=0;
// while(n>0){
//     int rem=n%10;
//     dec=dec+(rem*(int)Math.pow(2,pow));
//     pow++;
//     n=n/10;

// }
// System.out.println(dec);

// Q-3 reverse 
// int n=123;
// int rev=0;
// while(n>0){
//     int rem=n%10;
//     rev=rev*10+rem;
//     n=n/10;
// }
// System.out.println(rev);

// Q-6 pallindrom
// int n=390;
// int rev=0;
// int reverse=n;
// while (n>0) {
//     int rem=n%10;
//  rev=rev*10+rem;
//  n=n/10;
// }
// System.out.println(rev);
// if(rev==reverse){
//     System.out.println("this is pallindrom");
// }
// else{
//     System.out.println("this not pallindrom");
// }

// Q-7 prime num
// int n=10;
//     for(int i=2;i<=n;i++){
//         if(i%n==0){
//             System.out.println("not primt"+i);
//         }
//         else{
//             System.out.println("prime"+i);
//         }
//     }

//      }

// Q8


    }
}
