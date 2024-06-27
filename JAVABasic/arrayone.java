import java.util.Arrays;

public class arrayone {//find the trapping water
// public static int trappedwater(int height[]){
//     //max left boundary
//     int n=height.length;
//     int leftmax[]=new int[n];
//     leftmax[0]=height[0];
//     for(int i=1;i<n;i++){
//         leftmax[i]=Math.max(height[i],leftmax[i-1]);
//     }
//     //right max boundary
//     int rightmax[]=new int[n];
//     rightmax[n-1]=height[n-1];
//     for(int i=n-2;i>=0;i--){
//         rightmax[i]=Math.max(height[i],rightmax[i+1]);
//     }
//     //loop
//     int trapperaindwater=0;
//     for(int i=0;i<n;i++){
//         int waterlevel=Math.min(leftmax[i], rightmax[i]);
//         trapperaindwater+=waterlevel-height[i];
//     }
//             return trapperaindwater;
// }
//     public static void main(String args[]){
//         int height[]={4,2,0,6,3,2,5};
//         trappedwater(height);
//         System.out.println("trappedwater:"+trappedwater(height));

//     }


//find the stock problem
// public static int stock(int price[]){
//     int buyprice=Integer.MAX_VALUE;
//     // int sellprice=price[i];
//     int maxprofit=0;
//     for(int i=0;i<price.length;i++){
//         if(buyprice<price[i]){
//             int profit=price[i]-buyprice;
//             maxprofit=Math.max(maxprofit,profit);

//         }
//         else{
//             buyprice=price[i];
//         }
        
//     }
//     return maxprofit;
// }
// public static void main(String args[]){
//     int price[]={7,1,5,3,6,4};
//     stock(price);
//     System.out.println("maxprice:"+stock(price));
// }

//Q 

public static int  maxret(int array[]){
    int buyprice=Integer.MAX_VALUE;
    int maxprofit=0;
    //sell price=array[i]
    for(int i=0;i<array.length;i++){
        if(buyprice<array[i]){
            int profit=array[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        else{
            buyprice=array[i];
        }
    }
    return maxprofit;
}

}
