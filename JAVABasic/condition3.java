import java .util.*;
public class condition3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator){
            case '1':
            System.out.println(a+b);
            
            break;
            case '2':
            System.out.println(a-b);
            break;
            case '3':
            System.out.println(a*b);
            break;
            case '4':
            System.out.println(a/b);
            break;
            case '5':
            System.out.println(a%b);
            break;
            default:
            System.out.println("no");
        }
    }
}
