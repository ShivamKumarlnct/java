import java.util.Scanner;

public class prec22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int count = 0; // Initialize count variable
        int total = 0; // Initialize total variable

        System.out.println("Please enter a number:");
        input = scanner.nextInt();

        while (input > 0) {
            if (input > 0 && input <= 12) {
                System.out.println("*");
                count++; // Increment count for pattern *
            } else if (input > 12 && input <= 24) {
                System.out.println("**");
                count++; // Increment count for pattern **
            } else if (input > 24 && input <= 30) {
                System.out.println("***");
                count++; // Increment count for pattern ***
                input--; // Decrementing inside this block
            }
            input--; // Decrementing outside the if-else block
        }

        total = count; // Assign count to total

        System.out.println("Count: " + count);
        System.out.println("Total: " + total);

        scanner.close();
    }
}
