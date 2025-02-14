package practice.recursion.dividerconqure;

public class problem1 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Qick(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
       int pIdx=partition(arr,si,ei);
        Qick(arr, si, pIdx-1);
        Qick(arr,pIdx+1,ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[]={6,5,4,7,3,9,1,2};
        // print(arr);
        Qick(arr,0,arr.length-1);
        print(arr);

    }
}
