package Hasmap;
import java.util.*;

public class hash1 {
    public static void main(String args[]){
        // create
        HashMap<String,Integer>hm=new HashMap<>();
// insert
        hm.put("india", 100);
        hm.put("china", 120);
        hm.put("indonesia", 10);

        System.out.println(hm);

        // get
        int population=hm.get("india");
        System.out.println(population);

        // containesKey -o(1)
        System.out.println(hm.containsKey("india")); // o/p:true     
        System.out.println(hm.containsKey("US"));   //o/p false

        // remove
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isempty
        hm.clear();//it is remove all in hashmap(hm)
        System.out.println(hm.isEmpty());//o/p:false

    }
    
}
