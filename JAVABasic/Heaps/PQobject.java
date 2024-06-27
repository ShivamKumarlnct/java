package Heaps;
import java.util.*;
public class PQobject {
    static class student implements Comparable<student>{
        String name;
        int rank;

        public student(String name ,int rank){
            this.name=name;
            this.rank=rank;
        }
      
        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
PriorityQueue<student>pq=new PriorityQueue<>();
    pq.add(new student("shivam", 1));
    pq.add(new student("shivamkumar", 3));
    pq.add(new student("shivamgupta", 7));
    pq.add(new student("shivammadeshiya", 99));

    while(!pq.isEmpty()){
        System.out.println(pq.peek().name+ "->" + pq.peek().rank);
        pq.remove();
    }
    }
    
}
