package practice.backtracking.arraylist.LinkedList.stack;
import java.util.*;

public class Pallindrome {
    public static boolean pallindromeCheck(LinkedList<Character> s) {
        Stack<Character> ch = new Stack<>();

        for (int i = 0; i < s.size(); i++) {
            ch.push(s.get(i));
        }

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i) != ch.pop()) {
                return false;
            }
        }

        return true; 
    }
    public static void main(String args[]) {
        LinkedList<Character> s = new LinkedList<>();
        s.push('A');
        s.push('B');
        s.push('C');
        s.push('B');
        s.push('A');
        System.out.println(s);

        System.out.println("Is palindrome: " + pallindromeCheck(s));
    }
}
