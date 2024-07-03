package Hasmap;
import java.util.*;

public class iteration {
    public static void main(String args[]){
        HashSet<String>cities=new HashSet<>();
        cities.add("patna");
        cities.add("kota");
        cities.add("kolkata");
        cities.add("vanaras");
        cities.add("delhi");
        cities.add("gujrat");

    //    Iterator it= cities.iterator();
    //     while(it.hasNext()){
    //         System.err.println(it.next());
    //     }

    for(String city:cities){
        System.out.println(city);
    }

    }
    
}
