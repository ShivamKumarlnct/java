package practice.backtracking.arraylist.LinkedList.stack;

import java.util.*;

public class reverse {
    public static String reverse(String str) {
        Stack<Character> S = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {// check 
            S.push(str.charAt(idx));// add character
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!S.isEmpty()) {
            char curr = S.pop();// remove character
            result.append(curr);//store in string memory
        }
        return result.toString();//result is String form
    }
    public static int reversenum (int n){
        Stack<Integer> s =new Stack<>();
        int idx=0;
        int rev=0;
        while(idx<n){
            int rem=n%10;
             rev=rev*10+rem;
             n=n/10;
        }
        return rev;

       
    }
    public static void main(String args[]) {
        // String str = "abc";
        // String result = reverse(str);
        // System.out.println("abc:"+result);
        // -----------------------------------
// Stack<String> s=new Stack<>();
//     s.push("a");
//     s.push("b");
//     s.push("c");
//     s.push("d");
//     s.push("e");
  
//         while(!s.isEmpty()){
//             System.out.print(s.pop()+" ");

//         }
// -------------------------------------------
        int n=123;
        int rev=reversenum(n);
        System.out.println("rev:"+rev);

    }
}
