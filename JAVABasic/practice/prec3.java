package practice;

import java.util.*;

public class prec3 {
    public static int findindex(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        // int mid = -1;
        while (start <= end) {
           int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        int key = 25;
        int index = findindex(arr, key);
        System.out.println("index="+index);
    } 

}
