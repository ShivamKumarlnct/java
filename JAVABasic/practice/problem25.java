package practice;

public class problem25 {
    public static void main(String args[]){
        int arr[]={12,3,8432,52,153,231};
       int recount=0;
       for(int i=0;i<arr.length;i++){
           int count = 0;
        while(arr[i]>0){
           int find=arr[i]%10;
           arr[i]=arr[i]/10;
           System.out.println(find);
           count++;
        }
        System.out.println("total:" + count);
        if(count%2==0){
            recount++;
        }
       }
       System.out.println("total even no in this array:" + recount);

    }
}
    

