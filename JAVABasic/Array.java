import java.util.*;
public class Array {
    
// / int[] marks=new int[20];
        // Scanner sc=new Scanner(System.in);
        // Scanner sc=new Scanner(System.in);/ int[] marks=new int[20];
        // Scanner sc=new Scanner(System.in);
        // System.out.println("length of array="+marks.length);
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // marks[3]=sc.nextInt();

        // System.out.println("phy:"+ marks[1]);    
        // System.out.println("che:"+ marks[2]);
        // System.out.println("maths:"+ marks[3]);

        // // marks[2]=100;
        // marks[2]=marks[2]+1;
        // System.out.println(" change che:"+marks[2]);

        // int percentage=((marks[1]+marks[2]+marks[3])/3);
        // System.out.println("percentage:"+percentage);

        //Q1 find the update of value
    //     public static void updatethearray(int num[]){
    //         for(int i=0;i<num.length;i++){
    //             num[i]=num[i]+1;
    //             System.out.println(num[i]);
    //         }

    //     }
    //         public static void main(String args[]){
    //             int num[]={99,76,98};
    //             updatethearray(num);
        
        
    // }

    //Q2 linear search
//     public static int linear(int num[],int key){
//         for(int i=0;i<num.length;i++){
//             if(num[i]==key){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]){
//         int num[]={65,34,221,45,78};
//         int key=221;
//         int index=linear(num,key);
//         // int index;
//         if(index==-1){
//             System.out.println("not");
//         }
//         else{
//             System.out.println("yes");
// }
//     }

//Q3 largest value in array
// public static int largestnum(int array[]){
//     int largest=Integer.MIN_VALUE;
//     int smallest=Integer.MAX_VALUE;
//     for(int i=0;i<array.length;i++){
//         if(largest<array[i]){
//             largest=array[i];
//         }
//         if(smallest>array[i]){
//             smallest=array[i];
//         }
//     }
//     System.out.println("it is smallest value: "+ smallest);
//     return largest;
// }
// public static void main(String args[]){
//     int array[]={4,32,6,7,8};
//     largestnum(array);

//     System.out.println("largest :"+largestnum(array));
// }
    
//Q4 find the binary search in array
// public static int binary(int array[],int key){
//     int start=0;int end=array.length-1;
//     while(start<=end){
//         int mid=(start+end)/2;
//         if(array[mid]==key){
//             return mid;
//         }
//         if (array[mid]<key) {
//             start=mid+1;
//         } else {
//             end=mid-1;
            
//         }
//     }
//     return -1;
// }
// public static void main(String args[]){
// int array[]={2,3,23,45,56,89,221};
// int key=45;
//     binary(array,key);

//     System.out.println("index of key:"+ binary(array, key));
// }

//Q5 reverse problem M-1
// public static void reverse(int array[]){
//     for(int i=array.length-1;i>=0;i--){ 
//         System.out.print(" ,"+array[i]);
//     }
    
// // System.out.println(array[i]);
// }
// public static void main(String args[]){
//     int array[]={1,33,3,7,5,55,3,4,3,2,45,6,7,8,765432,1};
//     reverse(array);
    
// }
//M-2
// public static void reverse(int array[]){
//     int first=0;int last=array.length-1;
//     while(first<last){
//         int temp=array[last];
//          array[last]=array[first];
//         array[first]=temp;
//         first++;
//         last--;
//     }
// }
// public static void main(String args[]){
//     int array[]={1,2,345678,3,678,3};
//     reverse(array);
//     for(int i=0;i<array.length;i++){
//     System.out.print(" "+array[i]);
// }
// }
//Q6 pairs
// public static void pairs(int array[]){
//     int tp=0;
//     for(int i=0;i<array.length;i++){
//         int curr=array[i];
//         for(int j=i+1;j<array.length;j++){
//             System.out.print(" ( " + array[i] +" , " +array[j] + " )");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pair:" + tp);
// }
// public static void main(String args[]){
// int array[]={1,2,3,4,5,6,7,8};
// pairs(array);

// }
//Q7 find the subarray
// public static void subarray(int array[]){
//     int ts=0;int sum=0;
//     for(int i=0;i<array.length;i++){
//         int start=i;
//         for(int j=i;j<array.length;j++){
//             int end=j;
//             // System.out.println(sum);
//             // sum=sum+array[j];
//                                         // System.out.println(sum);
//             for(int k=start;k<=end;k++){
//                 System.out.print(array[k] +" ");
//             }
//             System.out.println();
//             ts++;
//         }
//         System.out.println();
//     }
//     System.out.println("find the total sub array:"+ts);

// }
// public static void main(String args[]){
//     int array[]={1,2,3,4,5};
//     subarray(array);
    

// }

//Q8 max subarray sum
// public static void sumofsubarray(int array[]){
//     int sum=0;
//     int max=Integer.MIN_VALUE;
//     for(int i=0;i<array.length;i++){
//         int start=i;
//         for(int j=i;j<array.length;j++){
//             int end=j;
//             sum=0;
//             for(int k=start;k<=end;k++){
                
//                 sum=sum+array[k];
//                 System.out.print(" "+array[k]);
//             }
//             System.out.println("="+sum);
//             if(max<sum){
//                 max=sum;
//             }
//         }
//     }
//     System.out.println("maxsubarray:"+max);
// }
// public static void main(String args[]){
//     int array[]={1,-2,6,-1,3};
//     sumofsubarray(array);
// }

//Q9 find the trapped water
public static int trappedwater(int height[]){
    //max left boundary
    int leftmax[]=new int[height.length];
    leftmax[0]=height[0];
    for(int i=0;i<=height.length;i++){
        leftmax[i]=Math.max(height[i],leftmax[i-1]);
    }
    //right max boundary
    int rightmax[]=new int[height.length];
    rightmax[height.length-1]=height[height.length-1];
    for(int i=height.length-1;i>=0;i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }
    //loop
    int trappedwater=0;
    for(int i=0;i<=height.length;i++){
        int waterlevel=Math.min(leftmax[i], rightmax[i]);
        trappedwater+=waterlevel-height[i];
    }
            return trappedwater;
}
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height);
        System.out.println(trappedwater(height));

    }
}
