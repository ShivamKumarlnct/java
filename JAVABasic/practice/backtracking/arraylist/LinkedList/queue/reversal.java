package practice.backtracking.arraylist.LinkedList.queue;
import practice.backtracking.arraylist.LinkedList.queue.queueLL.queue;
import practice.backtracking.arraylist.LinkedList.stack.stack;

import java.util.*;
public class reversal {
    public static void reversal(Queue<Integer> q){
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reversal(q);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
