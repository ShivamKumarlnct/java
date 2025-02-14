import java.util.Scanner;

public class code {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        if (k < 0 || k > n) {
            System.out.println("Invalid value of k");
            return;
        }

        int[] result = new int[n];

        for (int i = 0; i < k; i++) {
            result[i] = arr[n - k + i];
        }

        for (int i = 0; i < n - k; i++) {
            result[k + i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


