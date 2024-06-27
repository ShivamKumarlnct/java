package practice;

public class problem24 {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,1,1,1};
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;

            }
        }
        System.out.println("once :"+count);
    }
}
