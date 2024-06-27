package practice;

public class problems21 {
    public static boolean findduplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,1,1,2,3,1};
       findduplicate(arr);
       System.out.println(findduplicate(arr));
    }
    
}
