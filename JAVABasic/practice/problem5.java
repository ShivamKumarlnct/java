package practice;

// public class problem5 {
    // public static int remove(int arr[]){

    // }

//     public static void main(String args[]){

//         // find the roman number
//     int arr[]={1,1,2,3,4,4};
//     int n=arr.length;
//     // remove(arr);
//     for(int i=0;i<n-1;i++){
//         for(int j=i+1;j<n;j++){
//             if(arr[i]==arr[j]){
//             for(int k=j;k<n-1;k++){
//                 arr[k]=arr[k+1];
//             }
//             n--;
//             j--;
//             }
//         }
//         }
    
// for(int i=0;i<n;i++){
//     System.out.println(arr[i]);
// }
    
















public class problem5 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 6,3, 4, 2, 3, 5 ,6,5};
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < n - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    n--; 
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

        // int arr[]={2,3,4,5,6,7};
        // // find the largest number
        // int min=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>min){
        //         min=arr[i];
        //     }
        // }
        // System.out.println(min);
    


