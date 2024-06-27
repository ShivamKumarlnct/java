public class array2 {
//Q1 find the twice of element in array

    public static boolean twice(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        // int array[]={1,2,3,4,4};
        // int array[]={1,2,3,4};
        int array[]={1,1,1,3,3,3,45,6};

        
        System.out.println(twice(array));
    }

    //Q 2 find the target in array
    //M-1
    // public static int search(int array[]){
    //     int target=0;
    //     for(int i=0;i<array.length;i++){
    //         if(target==array[i]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String args[]){
    //     int array[]={4,5,6,7,0,1,2};
       
    //  System.out.println(search(array));  
    // }

    //M-2
    // public static int binary(int array[],int target){
    //     int start=0;
    //     int end=array.length-1;
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(array[mid]==target){
    //             return mid;
    //         }
    //         if(array[mid]<target){
    //             start=mid+1;
    //         }
    //         else{
    //             end=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String args[]){
    //     int array[]={4,5,6,7,0,1,2};
    //     int target=0;
    //    int result=binary(array,target);
    //   System.out.println(result);
    // }

    //Q3 find the binary
    // public static int binarysearch(int array[], int target) {
    //     int start = 0;
    //     int end = array.length - 1;
    //     while (start <= end) {
    //         int mid = (start + end) / 2;
    //         if (array[mid] == target) {
    //             return mid; 
    //         } 
    //         else if (array[mid] < target) {
    //             start = mid + 1; 
    //         } 
    //         else {
    //             end = mid - 1; 
    //         }
    //     }
    //     return -1; 
    // }
    
    // public static void main(String args[]) {
    //     int array[] = {4, 5, 6, 0, 1, 2, 9};
    //     int target = 3;
    
    //     System.out.println(binarysearch(array, target)); 
    // }
    
}
