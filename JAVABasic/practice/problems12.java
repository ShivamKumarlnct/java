package practice;
public class problems12 {
    public static void main(String args[]){
        int arr[]={1,2,3,3,2,1};{
            int count = 0;

            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        System.out.println(arr[j]);
                        count++;
                    }
                }
               
            }
            System.out.println("total number of duplicate:"+count);
        }
    }
    
}
