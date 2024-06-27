package practice;

public class problems5 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5,6};
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - i - 1;
            if (i >= j) {
                break;
            }
            System.out.print(arr[i] + ", " + arr[j] + ", ");
        }
        if (arr.length % 2 != 0) {
            System.out.print(arr[arr.length / 2]);
        }
    }
}
