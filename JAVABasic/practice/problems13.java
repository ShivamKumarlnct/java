package practice;
public class problems13 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 ,9,10};
        int m = 3;
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the conditions
            if (i == m || i == m + 1 || i == 3 * m || i == 3 * (m)+1) {
                // Skip printing this element
                continue;
            }
            // Print the element
            System.out.print(arr[i] + " ");
        }
    }
}
