package Heaps;
import java.util.*;
public class weakest {
    static class row implements Comparable<row>{
        int soliders;
        int idx;

        public row(int soliders,int idx){
            this.soliders=soliders;
            this.idx=idx;
        }
        @Override
        public int compareTo(row r2){
            if(this.soliders==r2.soliders){
                return this.idx-r2.idx;
            }
            else{
                return this.soliders-r2.soliders;

            }
        }
    }

    public static void main(String args[]){
        int army[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<row>pq=new PriorityQueue<>();

        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new row(count, i));
        }
        for(int i=0;i<k;i++ ){
            System.out.println("R"+pq.remove().idx);
        }   
    }
    
}
