import java.util.Arrays;
// public class  practice {

//    public static void pattern(int n){
//       for(int i=4;i>=1;i--){
//          for(int j=1;j<=i;j++){
//             if(j==1||j==3){
//             System.out.print(1+" ");
//             }
//             else{
//                System.out.print(0+" ");
//             }
//          }
//          System.out.println();
//       }
//    }
//    public static void main(String args[]){
      // pattern(4);
   //  Scanner sc=new Scanner(System.in);
   //  System.out.println("this is change in value");
      // char a='a';
      // char b='b';
      // System.out.println((int)(a));
      // System.out.println((int)(b));
      // int n=456776765;
      // while(n>0){
      //          int rev=n%10;
      //    System.out.print(rev);
      //    n=n/10;
      // }


//          }
// }
// ----------------------------------------------------------------
// import java.util.*;
 public class  practice{
   // public static int binary(int array[],int key){
   //    int start=0;int end=array.length-1;
   //    while(start<=end){
   //       int mid=(start+end)/2;
   //       if(array[mid]==key){
   //          return mid;
   //       }
   //       if(array[mid]<key){
   //          start=mid+1;
   //       }
   //       else{
   //          end=mid-1;
   //       }
         
   //    }
   //    return -1;
   // }
   //decimal to binary
//    public static void main(String args[]){
//       int bin=0;
//       int pow=0;
//       int x=10;
//       while(x>0){
//        int  rem=x%2;
//        System.out.print(rem);
//        x=x/2;
//       }

//    }
// }
   //    int array[]={1,2,3,4,6,7,8};
   //    int key=6;
   //    binary(array,key);
   //    System.out.println(binary(array, key));
   

   //  int arr[2];
   //  System.out.println(arr[0]); 
   //  System.out.println(arr[1]);  
   
   //  if(a==9){
   //  System.out.println("ok");
   //  System.out.println("mast");}
   //  else{
   //  System.out.println("bye");
   //  }
    

      
      // if((a>b)||(a>c)){
      //    System.out.println(a+"=max");
      // }
      // else if(b>c){
      //    System.out.println(b+"=max");
      // }
      // else{
      //    System.out.println(c+"=max");
      // }
      // Scanner sc=new Scanner(System.in);
      // int a=sc.nextInt();
      // int b=sc.nextInt();
      // // System.out.println(Math.pow(a,b));
      // int n=sc.nextInt();
      // // System.out.println(Math.sqrt(n));
      // // System.out.println((a*b*n)/100);
      // int ci=a*(int)(Math.pow(1+(b/100),n));
      // System.out.println(ci);
   //    public static int prime(int n){
   //       for(int i=2;i<=n/2;i++){
   //         if(n%i==0){
   //          // System.out.println();
   //         }
   //         else{
   //          System.out.println(i);
   //         }
   //       }
      
   // public static void main(String args[]){
   //    int n=10;
   //    prime(n);
   // }


   //Q11
   
   // public static void main(String args[]){
   //    int array[]={5,4,1,3,2};
   //    //original array
   //    for(int i=1;i<array.length;i++){
   //       System.out.println(array[i]);
   //    }
   //          for(int i=0;i<array.length;i++){
   //       for(int j=1+i;j<array.length;j++){
   //          if(array[i]>array[j]){
   //             int tem=array[i];
   //             array[i]=array[j];
   //             array[j]=tem;
   //          }
   //       }
   //    }
   //    System.out.println();
   //    System.out.println("accending array");
   //    for(int i=0;i<array.length;i++){
   //    System.out.print(" "+array[i]);
   //    }
   //    }

   //Q removing element in array
   // public static void main(String args[]){
   //    int array[]={5,4,1,3,2};
   //    int target=1;
   //    for(int i=0;i<array.length;i++){
   //       if(array[i]==target){
   //          array[i]=array[i-1];
         
   //       }
   //       System.out.print(" "+array[i]);
   //    }
   // }
//    public static int max(int array[]){
//   int maxi=Integer.MIN_VALUE;
//       for(int i=0;i<array.length;i++){
//          if(maxi<array[i]){
//             maxi=array[i];
//          }
//       }
//       return maxi;
//    }
// public static int tar(int array[],int target){
//          for(int i=0;i<array.length;i++){
//          for(int j=i+1;j<array.length;j++){
//             int sum=array[i]+array[j];
//             if(target==sum){
//                return sum;
//             }
//          }
//          }
//          return -1;
//       }
//    public static void main(String args[]){
//       int array[]={4,9,2,99};
//       int target=108;
      
//       System.out.println(tar(array,target));
      // max(array);
      // System.out.println(max(array));

      //Q find the sum of two index in array
     
   // }   pairs
   // public static void pairs(int array[]){
   //    for(int i=0;i<array.length;i++){
   //       int curr=array[i];
   //       for(int j=i+1;j<array.length;j++){
   //             System.out.print("("+curr + "," + array[j]+")");
   //       }
   //       System.out.println();
   //    }
   // }
   // public static void main(String args[]){
   //    int array[]={1,2,3,5,6,7,8};
   //    pairs(array);
   // }
//find the subarray
//    public static void  subarray(int array[]){
//       for(int i=0;i<array.length;i++){
//          int start=i;
//          for(int j=0;j<array.length;j++){
//             int end=j;
//             for(int k=start;k<end;k++){
//                System.out.print(" "+array[k]);
//             }
// System.out.println();
//          }
//          // System.out.println();
//       }
//    }
//    public static void main(String args[]){
//       int array[]={1,2,3,4,5,6,7,8};
//       subarray(array);
//    }

//add the two number
public static void addtwono(int l1[],int l2[]){
   
}
public static void main(String args[]){
   int l1[]={2,4,3};
   int l2[]={5,6,4};
   addtwono(l1,l2);
}
}
 
 