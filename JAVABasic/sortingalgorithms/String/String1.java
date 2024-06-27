package sortingalgorithms.String;
import java.util.*;

import java.util.*;
public class String1 {

    // Scanner sc=new Scanner(System.in);
    // String name;
    // name=sc.nextLine();
    // System.out.println(name);

    // String fullname="Shivam kumar";
    // System.out.println(fullname.length());

//     String first="shivam";
//     String second="kumar";=
//     String fullname=first + " " + second;
//     System.out.println(fullname.charAt(3));


//Q find the pallindrom in string
// public static boolean pallindrom(String name){
//     for(int i=0;i<name.length();i++){
//         int n=name.length();
//         if(name.charAt(i)==name.charAt(n-1-i)){
//             return true;
//         }
//     }
//     return false;
// }
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// String name=sc.next();
// pallindrom(name);
// System.out.println(pallindrom(name)
// );

//  }


    //find the sortest path in string
    // public static float sortestpath(String path){
    //      int x=0,y=0;
    //     for(int i=0;i<path.length();i++){
           
    //         int dir=path.charAt(i);
    //         if(dir=='S'){
    //             y--;
    //         }
    //         else if(dir=='N'){
    //             y++;
    //         }
    //         else if(dir=='E'){
    //             x++;
    //         }
    //         else{
    //             x--;
    //         }
    //     }
    //     int x2=x*x;
    //     int y2=y*y;

    //     return (float)(Math.sqrt(x2+y2));
    // }
    // public static void main(String args[]){
    //     String path="WNEENESENNN";
    //     // String path="NNENN";
        
    //     System.out.println(sortestpath(path));
    // }

    //find the string function-compares
    // public static void main(String args[]){
    //     String n1="shivam";
    //     String n2="shivam";
    //     String n3=new String("shivam");
        // if(n1==n2){
        //     System.out.println("it is equal");
        // }
        // else{
        //     System.out.println("it is not equal");
        // }
        // if(n1==n3){
        //     System.out.println("it is equal");
        // }
        // else{
        //     System.out.println("it is not equal");
        // }
    //     if(n1.equals(n3)){//using function for compare
    //         System.out.println("it is equal");
    //     }
    //     else{
    //         System.out.println("it is not equal");
    //     }
    // }

    //find the substring
    // public static String substring(String name,int st,int ed){
    //     String subname="";
    //     for(int i=st;i<ed;i++){
    //   subname+=name.charAt(i);
    //     }
    //     return subname;
    // }
    // public static void main(String args[]){
    //     String name="shivamkumar";
    //     System.out.println(substring(name, 0, 4));
    //     // System.out.println(name.substring(0, 4));//use function

    // }


    //print largest string
    // public static void main(String args[]){
    //     String fruits[]={"apple","mango","banana"};
    //     String largest=fruits[0];
    //     for(int i=0;i<fruits.length;i++){
    //         if(largest.compareTo(fruits[i])<0){
    //             largest=fruits[i];
    //         }

    //     }
    //     System.out.println(largest);
    // }

    //string builder
    // public static void main(String args[]){
    //     StringBuilder sb=new StringBuilder();
    //     for(char ch='a';ch<='z';ch++){
    //         sb.append(ch);//time complexity:O(26) loop run 26 times
    //     }
    //     System.out.println(sb);
    //     System.out.println("length of sb:"+sb.length());
    // }

    //first letter change the upper-case
//     public static String uppercase(String str){
//         StringBuilder sb=new StringBuilder();//it is store
//         char ch=Character.toUpperCase(str.charAt(0));//it is change the first letter
//         sb.append(ch);//it is follow the next value
//         for(int i=1;i<str.length();i++){
//             if((str.charAt (i)==' ')&& i<str.length()-1){
//                 sb.append(str.charAt(i));//after space change the letter
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }
// return sb.toString();
//     }
//     public static void main(String args[]){
//         String str="i am shivam";
        
//         System.out.println(uppercase(str));
//         System.out.println(uppercase(str).length());
//     }

//compress string
public static String compress(String str){
    String newstr="";
    for(int i=0;i<str.length();i++){
        Integer count=1;
        if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        newstr+=str.charAt(i);
        if(count > 1){
            newstr+=count.toString();
        }
    }
    return newstr;
}
public static void main(String args[]){
    String str="abbbcd";
    // compress(str);
    System.out.println(compress(str));
}
}
