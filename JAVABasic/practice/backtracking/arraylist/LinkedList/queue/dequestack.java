package practice.backtracking.arraylist.LinkedList.queue;
import java.util.*;
public class dequestack {
    static class stack{
        Deque<Integer>dq=new LinkedList<>();

        public void push(int data){
            dq.addLast(data);
        }
        
        public int pop(int data) {
          return dq.removeLast();
        }
        
        public int peek() {
          return  dq.peek();
        }
    }

    // -------------------------------------
    static class Queue{
        Deque<Integer> dq=new LinkedList<>();

        public  void add(int data){
            dq.addLast(data);
        }
        public int remove(){
           return dq.removeFirst();
        }
        public int peek(){
            return dq.peek();
        }
    }
    public static void main(String args[]){
        // Stack <Integer>s=new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("peek:"+s.peek());
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        Queue q=new Queue() ;
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek:"+q.peek());
        
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());            
        

    }
    
}
