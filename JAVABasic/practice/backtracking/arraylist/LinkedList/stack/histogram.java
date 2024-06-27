package practice.backtracking.arraylist.LinkedList.stack;

import java.util.Stack;

public class histogram {
    public static void histogram(int arr[]){
        Stack<Integer> s=new Stack<>();
        int maxarea=0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
    // right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
               nsr[i]=s.peek();
            }
            s.push(i);
        }
     // left
     s=new Stack<>();
        for (int i =0; i<arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<arr.length;i++){
          int  height=arr[i];
          int width=nsr[i]-nsl[i]-1;
          int currarea=height*width;
           maxarea= Math.max(currarea,maxarea);
        }
        System.out.println("max area:"+maxarea);
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
        histogram(arr);

    }
    
}
