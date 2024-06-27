package practice.backtracking;
import java.util.*;

public class back8 {
    public static void keypad(String str[],int value){
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if (i == 2 || i == 3) {
                    String newstr = str[i].charAt(j)+str[i+1].charAt(j);
                }
            }
          
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str[]={" ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        int digit=sc.nextInt();
        int value=23;


    }
    
}
