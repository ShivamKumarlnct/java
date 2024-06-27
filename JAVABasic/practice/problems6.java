package practice;

public class problems6 {
    public static void main(String args[]) {
        int arr[] = { 5, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {//int j=arr[i+1];
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
      for(int i=0;i<arr.length;i++){
        // System.out.print((int)Math.pow(arr[i], 2)+" ");
        System.out.println(arr[i]*arr[i]);
      }
    }
}
