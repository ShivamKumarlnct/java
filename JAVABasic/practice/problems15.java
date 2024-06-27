package practice;
import java.util.*;


public class problems15 {
    public static void main(String args[]) {
        int input = 25;
        while (input > 0) {
            if (input > 0 && input <= 12) {
                System.out.println("*");
            } else if (input > 12 && input <= 24) {
                System.out.println("**");
            } else if (input > 24 && input <= 30) {
                System.out.println("***");
            }
            input--; 
        }
    }
}
    

