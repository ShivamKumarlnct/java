package practice.backtracking.arraylist.LinkedList.queue;
import java.util.LinkedList;
import java.util.Queue;

public class MaxInQueue {
   
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        System.out.println("Queue: " + q);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = q.poll();
            if (num > max) {
                max = num;
            }
            q.add(num);
        }
        System.out.println("Maximum element in the queue: " + max);
    }
}
