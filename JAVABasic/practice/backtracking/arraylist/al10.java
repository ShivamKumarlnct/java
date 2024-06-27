package practice.backtracking.arraylist;

import java.util.ArrayList;

public class al10 {
    public static boolean cheak(ArrayList<Integer>list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        // list.add(4);
  
        System.out.println(cheak(list));
        
    }
    
}
