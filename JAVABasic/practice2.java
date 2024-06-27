import java.util.*;
public class practice2{

//     public static void main(String args[]){
//         int n=10;
//         int sum=0;
//         for(int i=2;i<=n;i++){
//             boolean prime=true;
//             for(int j=2;j<i;j++){
//                 if(i%j==0){
//                     prime=false;
//                 }
//             }
//             if(prime==true){
//             System.out.println(i);
//             sum=sum+i;
//     }
// }   
// System.out.println(sum);
//  }

// public static void main(String args[]){
//     // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//     int matrix[][]={{1,2,3,45},{2,3,4,5}};
//     for(int i=0;i<=matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
// System.out.print( " "+matrix[i][j]);
//         }
         
//     } 
   
// }

 

// public static void main(String args[]){
//     int array[][]={{12,45,33},{94,54,23},{98,59,27}};
//       int max=Integer.MIN_VALUE;
//       int row =-1;
//       int col=-1;

//       for(int i=0;i<array.length;i++){
//         for(int j=0;j<array[0].length;j++){
//             if(array[i][j]>max){
//               max= array[i][j];
//               row=i;
//               col=j;
//             }
//         }
//       }
      
//            System.out.println(max);
//         System.out.println(row + "," +col);


// }
//find the sum of diagonal value
// public class CandidateCode {
   // public static void main(String args[]){
   //    int min = Integer.MIN_VALUE;
   //    int array[][] = {{12, 45, 33, 27}, {94, 54, 23, 53}, {98, 59, 27, 62}, {11, 51, 67, 13}};
   //    int i=1,j=1;
   //    for ( i = 1; i <=4; i++) {
   //       for ( j = 1; j <=4; j++) {
   //          if (i == j) {
   //             System.out.println("(" + i + "," + j + ")");
   //          }
   //       }
   //    }
   // }

   // public static void main(String args[]){
   //    int l1[]={2,4,3};
   //    int l2[]={5,6,4};
   //    int sum;
   //    int carry=1;
   // for(int i=0;i<l1.length;i++){
   //    for(int j=0;j<l2.length;j++){
   //       if(i==j){

   //          sum=l1[i]+l2[j];
   //          sum=sum%10;
   //         System.out.print(sum +" ");
   //          }
              
   //       }
   //    }

   
   // }

//    public static void main(String args[]){
//       String s="abcabcbb";
//       int count=0;
//       for(int i=0;i<s.length();i++){
//          boolean is=true;
//          for(int j=i+1;j<s.length();j++){
//             if(s.charAt(i)==s.charAt(j)){
//                is=false;
//             }
//          }
//          if(is){
//             count++;
//          }
         
//       }
// System.out.println("not:"+count);

// }
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String d=sc.nextLine();
   // String d="may";
   if(d.equals("jan")||d.equals("march")){
      System.out.println(" 30 days");
   }
   else if(d=="may"||d=="june"){
System.out.println("31 days");
   }
   else{
      System.out.println("feb");
   }
}
}


