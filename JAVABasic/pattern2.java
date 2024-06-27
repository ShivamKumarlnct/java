public class pattern2 {
    //Q1 find the hollowrectangle
    // public static void hollowrectangle(int totalrow,int totalcol){
    //     //outer loop as print total row
    //     for(int i=1;i<=totalrow;i++){
    //         //inner loop as print total col
    //         for(int j=1;j<=totalcol;j++){
    //             //conditon for print space or star,|| this is  denoted or
    //             if(i==1||i==totalrow||j==1||j==totalcol){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //             // System.out.println();

    //         }
    //           System.out.println();
    //     }
    // }
    // public static void main(String args[]){
    //     hollowrectangle(4, 5);
    // }

    //Q2 find the rotated half pyramid
    // public static void halfpyramid(int totalrow,int totalcol){
    //     //outer line
    //     for(int i=1;i<=totalrow;i++){
    //         //space
    //         for(int j=1;j<=totalcol-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[]){
    //     halfpyramid(4, 4);

    // }
    //Q3 find the half pyramid with number
    // public static void halfpyramidno(int totalrow,int totalcol){
    //     //outer line
    //     for(int i=1;i<=5;i++){
    //         for(int j=1;j<=5-i+1;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[]){
    //     halfpyramidno(5, 5);

    // }

    //Q4 find the traingle
    // public static void traingle(int n){
    //     int count=1;
    //     //outer
    //     for(int i=1;i<=5;i++){
    //         //inner
    //         for(int j=1;j<=i;j++){
              
    //             System.out.print(count+" ");
    //             count++;

    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[]){
    //     traingle(5);

    // }
    //Q5 find the 0-1 triangle
    // public static void traingle(int n){
    //     //outer
    //     for(int i=1;i<=5;i++){
    //         for(int j=1;j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print(1+" ");
    //             }
    //             else{
    //                 System.out.print(0+" ");
    //             }
                
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[]){
    //     traingle(5);

    // }

    //Q6 butterfly
    //first half
    // public static void butterfly(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){//star
    //             System.out.print("*");
    //         }
    //         //space
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         //star
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //          System.out.println();
    // }
    //second half
    // for(int i=n;i>=1;i--){ //n=5
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");//star
    //     }
    //     for(int j=1;j<=2*(n-i);j++){
    //         System.out.print(" ");//space
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");//star
    //     }
    //     System.out.println();

    // }
    //     }
       
    // public static void main(String args[]){
    //     butterfly(5);

    // }

    //Q7 solid rohmbus
    //         public static void solid(int n){
    //              for(int i=1;i<=n;i++){//row
    //             for(int j=1;j<=n-i;j++){//space
    //                 System.out.print("  ");
    //             }
    //             for(int j=1;j<=8;j++){//star
    //                 System.out.print(" * ");
    //             }
    //              System.out.println();
    //         }
       
    //     }
            
    //     public static void main(String args[]){
    //         solid(5);
    // }

    //Q8 hollw rhombus
    // public static void hollw(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){

    //             if(i==1||i==n||j==1||j==n){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[]args){
    //     hollw(5);
    // }

    //Q9 diamond
//     public static void diamond(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
              
//                 System.out.print("*");
                
//             }
//             System.out.println();
//         }
//          for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
              
//                 System.out.print("*");
                
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         diamond(5);
//     }
//Q10
// public static void numberpyramid(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             System.out.print(" "+j);
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     numberpyramid(5);
// }

//Q11
// public static void pyramid(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print(" "+i);
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     pyramid(5);

// }

//Q12
// public static void pallindromic(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print(i);
//         }
//         for(int j=n-1;j>=1;j--){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     pallindromic(5);

// }
// find the five time multiply
public static void main(String args[]){
    int n=3;
    int ans=1;
    for(int i=0;i<5;i++){
        ans=ans*n;
    //   System.out.println(ans);
    }
    System.out.println(ans);


}
}