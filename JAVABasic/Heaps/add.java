package Heaps;
import java.util.*;
public class add{
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data){

        arr.add(data);
        int x=arr.size()-1;
        int par=(x-1)/2;

        while(arr.get(x)<arr.get(par)){
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par, temp);

            x=par;
            par=(x-1)/2;
        }
    }
   
public int peek(){
    return arr.get(0);
}
private void  heapify(int i){
    int idx=i;
    int left=2*i+1;
    int right=2*i+2;

    if(left<arr.size()&&arr.get(idx)>arr.get(left)){
        idx=left;
    }
    if (right < arr.size() && arr.get(idx) > arr.get(right)) {
        idx = right;
    }
    if(idx!=i){
    int temp=arr.get(i);
    arr.set(idx,arr.get(idx));
    arr.set(idx, temp);

    heapify(idx);
    }
}
public int remove(){
    int data=arr.get(0);
    int temp=arr.get(0);
    arr.set(0, arr.get(arr.size()-1));
    arr.set(arr.size()-1,temp);

    arr.remove(arr.size()-1);
    heapify(0);
    return data;
}


    public static void main(String args[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(10);     
        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); 
            pq.remove();
        }   

    }

}