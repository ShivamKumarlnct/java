package sortingalgorithms;
import java.util.*;
public class matrix {
//     public static int search(int matrix[][]){
//         int max=Integer.MIN_VALUE;
//         // int min=Integer.MAX_VALUE;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]>max){
//                     max=matrix[i][j];
//                      System.out.println("("+i + ", " + j +")");

//                 }
//             }
//         }
//         return max;
//     }
//     public static void main(String args[]){
//         int matrix[][]=new int[3][3];
//         int n=matrix.length,m=matrix[0].length;
//         Scanner sc=new Scanner(System.in);
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();//i/p
//             }
//         }//output
//         for(int i=0;i<n;i++){
//        for(int j=0;j<m;j++){
//         System.out.print(matrix[i][j]+" ");
// }
// System.out.println();
//         }
// System.out.println(search(matrix));
//     }

    // Q spiral 
    // public static void spiral(int matrix[][]){
    //     int startrow=0;
    //     int endrow=matrix[0].length-1;
    //     int startcol=0;
    //     int endcol=matrix[0].length-1;

    //     while(startrow<=endrow && startcol<=endcol){//top
    //         for(int j=startcol;j<=endcol;j++){
    //             System.out.print(matrix[startrow][j]+" ");
    //         }
    //         for(int i=startrow+1;i<=endrow;i++){//left
    //             System.out.print(matrix[i][endcol]+" ");
    //         }
    //         for(int j=endcol-1;j>=startcol;j--){//bottom
    //             if(startrow==endrow){
    //                 break;
    //             }
    //             System.out.print(matrix[endrow][j]+" ");

    //         }
    //         for(int i=endrow-1;i>=startrow+1;i--){//right
    //             if(startcol==endcol){
    //                 break;
    //             }
    //             System.out.print(matrix[i][startcol]+" ");
    //         }
    //         startrow++;
    //         startcol++;
    //         endrow--;
    //         endcol--;
    //     }
    //         System.out.println();
    // }
    // public static void main(String args[]){
    //     int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //     spiral(matrix);
    //     // System.out.println(spiral(matrix));
    // }

    //diagonal
//     public static int diagonal(int matrix[][]){
//         int sum=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(i==j){
//                     sum+=matrix[i][j];
//                 }
//            else if(i+j == matrix.length-1){
//                 sum+=matrix[i][j];
//             }
                    
                
//             }
//         }
// return sum;
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         diagonal(matrix);
//         System.out.println("sum of both diagonal:"+diagonal(matrix));
//     }

//search in sorted a matrix
//m-1

// public static void search(int matrix[][],int key){  
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){ 
//             if(matrix[i][j]==key){
//                 System.out.println( i +" ,"+ j );
//                 System.out.println(matrix[i][j]);
//         }
//     }
//     }
// }
// public static void main(String args[]){
//   int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//   int key=15;
//   search(matrix,key);

// }

//m-2

public static boolean search(int matrix[][],int key){
    int row=0;int col=matrix[0].length-1;
    while(row<matrix.length&& col>=0){
    if(matrix[row][col]==key){
        System.out.println("("+ row + "," +col + ")");
        return true;
    }
    else if(key<matrix[row][col]){
        col--;
    }
    else{
        row++;
    }
}
    System.out.println("not found");
    return false;
}
    
public static void main(String args[]){
   int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
   int key=20;
System.out.println(search(matrix,key));


}
}
