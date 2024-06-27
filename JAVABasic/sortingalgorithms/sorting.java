package sortingalgorithms;

import java.util.Arrays;
import java.util.Collections;

public class sorting {
//bubble sort

//     public static void bubble(int array[]){
//     for(int i=0;i<array.length;i++){
//         for(int j=i+1;j<array.length;j++){
//             if(array[i]>array[j]){
//                 int temp=array[i];
//                 array[i]=array[j];
//                 array[j]=temp;
//             }
//         }
//     }
// }
    // public static void print(int array[]){
    //     for(int i=0;i<array.length;i++){
    //    System.out.print(" "+array[i]);

    //     }

    // }

//     public static void main(String args[]){//bubble sort
//     int array[]={5,4,1,3,2};
//     bubble(array);
//     print(array);
//     }

    //selsection sort
    // public static void selsectionsort(int array[]){
    //  for(int i=0;i<array.length-1;i++){
    //     int min=i;
    //     for(int j=i+1;j<array.length;j++){
    //         if(array[min]>array[j]){
    //             min=j;
    //         }
    //     }
    //     int temp=array[min];
    //     array[min]=array[i];
    //     array[i]=temp;
    //  }
    // }
     public static void print(Integer array[]){
     for(int i=0;i<array.length;i++){
        System.out.print(" "+array[i]);
     }
    }
    
    // public static void main(String args[]){
    //     int array[]={5,4,1,3,2};
    //     selsectionsort(array);
    //     print(array);
        
    // }

    //insertion sort
    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            while(prev >=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=curr;
        }
    }
public static void main(String args[]){
    Integer array[]={5,4,1,3,2};
    // insertionsort(array);
// it is used for accending order

    // Arrays.sort(array);
    // Arrays.sort(array,0,3);

    // Arrays.sort(array,Collections.reverseOrder());
    Arrays.sort(array,0,3,Collections.reverseOrder());
    print(array);
}
}
