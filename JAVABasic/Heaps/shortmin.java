package Heaps;

public class shortmin {

    public static void heapify(int arr[],int i,int size){
        int idxmin=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left < size && arr[left]< arr[idxmin]){
            idxmin=left;
        }
        if (right < size && arr[right] < arr[idxmin]) {
            idxmin = right;
        }
        if(idxmin!=i){
            int temp=arr[0];
            arr[0]=arr[idxmin];
            arr[idxmin]=temp;

            heapify(arr, idxmin, size);
        }
    }
    public static void Heapssort(int arr[]){
        int n=arr.length;
        // step-1 build min heap
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>=0;i--){
            // swap
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,5,3,4};

        Heapssort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
