package Hasmap;
import java.util.*;

public class interation {
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india", 100);
        hm.put("indonesia", 10);
        hm.put("china", 1000);
        hm.put("USA", 1010);
        hm.put("UK", 11100);
        hm.put("nepal", 1090);
        hm.put("korea", 16800);


        // iteration
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        for(String k:keys){
            System.out.println("keys = "+k+" value = "+hm.get(k));
        }



    }
    
}
