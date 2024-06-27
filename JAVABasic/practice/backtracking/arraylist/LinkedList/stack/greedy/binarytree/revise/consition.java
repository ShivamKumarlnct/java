package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.revise;
import java.util.*;
public class consition {
    public static void main(String args[]){
        // if-else
        Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         if(age>18){
//             System.out.println("you are eligibal");
//         }
//         else{
//             System.out.println("not");
//         }
// // ternary
//         String operation = (age>18) ? "eligibal" : "not";
//         System.out.println(operation);

// int a=10;
// int b=20;
// char operator = sc.next().charAt(0);

// switch (operator) {
//     case '1':
//         System.out.println(a+b);
//         break;
//         case '2' :
//         System.out.println(a-b);
//         break;
//     default:
//         System.out.println("no");
//         break;
// }

int nums=sc.next().charAt(0);
int a=10;
int b=20;
switch (nums) {
    case '1':
        System.out.println(a + b);
        break;
    case '2':
        System.out.println(a - b);
        break;
    case '3':
        System.out.println(a * b);
        break;
    case '4':
        System.out.println(a / b);
        break;

    default:
    System.out.println("not");
        break;
}


    }
    
}
