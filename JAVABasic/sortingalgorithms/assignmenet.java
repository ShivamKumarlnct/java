package sortingalgorithms;

public class assignmenet {
//     public static void bubble(int array[]){
//         for(int i=0;i<array.length;i++){
//    for(int j=i+1;j<array.length;j++){
//         if(array[i]<array[j]){
//             int temp=array[i];
//             array[i]=array[j];
//             array[j]=temp;
//     }
//     }
//     }
//     }
//     public static void print(int array[]){
//         for(int i=0;i<array.length;i++){
//             System.out.print(" "+array[i]);
//         }
//     }
//     public static void main(String args[]){
//         int array[]={3,6,2,1,8,7,4,5,3};
//         bubble(array);
//         print(array);
//     }

//selection sort
// public static void selection(int array[]){
// for(int i=0;i<array.length-1;i++){
//     int min=i;
//     for(int j=i+1;j<array.length;j++){
//         if(array[min]<array[j]){
//             min=j;

//         }
//     }
//     int temp=array[min];
//    array[min]=array[i];
//    array[i]=temp;
// }
// }
// public static void print(int array[]){
//     for(int i=0;i<array.length;i++){
//         System.out.print(" "+array[i]);
//     }
// }

// public static void main(String args[]){
//     int array[]={3,6,2,1,8,7,4,5,3,2};
//     selection(array);
//     print(array);
// }

//print the number of 7's that are in the 2d array

// public static void main(String args[]){
//     int array[][]={{4,7,8},{8,8,7}};
//      int count=0;
//     for(int i=0;i<array.length ;i++){
//         for(int j=0;j<array[0].length;j++){
//             if(array[i][j]==7){
//                 count++;
//             }
//         }
//     }
//     System.out.println(count);
// }


//print the sum of second row
// public static void main(String args[]){
//     int sum=0;
//     int array[][]={{1,4,9},{11,4,3}};
//     for(int i=0;i<array.length;i++){
//         for(int j=0;j<array[0].length;j++){
//             if(i==1){
//                 sum+=array[i][j];
//             }

//         }
//     }
//     System.out.println(sum);
// }

//find the transpose
public static void print(int array[][]){
int row=2;int col=3;
int transpose[][]=new int[col][row];
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      transpose[col][row]=array[row][col];
    }
}


}

public static void main(String args[]){
    int array[][]={{1,4,9},{11,4,3}};
    print(array);
}
}

