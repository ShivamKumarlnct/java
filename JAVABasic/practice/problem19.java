package practice;

public class problem19 {
    public static void main(String args[]) {
        int max = Integer.MIN_VALUE;

        int arr[][] = { { 1, 2 }, { 1, 2, 3 } };
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of array:" + sum);
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("Max sum: " + max);
    }
}
