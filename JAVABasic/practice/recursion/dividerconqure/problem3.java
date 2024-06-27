package practice.recursion.dividerconqure;

public class problem3 {
    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1; // Base case: element not found
        }

        int mid = (si + ei) / 2;

        if (arr[mid] == target) {
            return mid; // Base case
        }

        // left half
        if (arr[si] <= arr[mid]) {
            // left half
            if (arr[si] <= target && target <= arr[mid]) {
                // left half
                return search(arr, target, si, mid - 1);
            } else {
                // Recur on the right half
                return search(arr, target, mid + 1, ei);
            }
        } else { // right half
            // right half
            if (arr[mid] <= target && target <= arr[ei]) {
                // right half
                return search(arr, target, mid + 1, ei);
            } else {
                // left half
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 5, 8, 3, 2, 9, 0, 1, 2 };
        int target = 8;
        int index = search(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }
}
