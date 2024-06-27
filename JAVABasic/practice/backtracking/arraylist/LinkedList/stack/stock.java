package practice.backtracking.arraylist.LinkedList.stack;

import java.util.Stack;

public class stock {
    public static void stock(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;//span index 0=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int curr=stocks[i];

            while(!s.isEmpty() && curr>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevhight=s.peek();
                span[i]=i-prevhight;

            }
            s.push(i);
        }

    }
    public static void main(String args[]){
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];//span store the new arr
        stock(stocks,span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }

    }
    
}
