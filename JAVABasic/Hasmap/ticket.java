package Hasmap;
import java.util.*;
public class ticket {
    public static String getstart(HashMap<String,String>ticket){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key:ticket.keySet()){
            revMap.put(ticket.get(key),key);
        }
        for (String key : ticket.keySet()) {
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String>ticket=new HashMap<>();

        ticket.put("chenni", "benguluru");
        ticket.put("mumbai", "delhi");
        ticket.put("goa", "chenni");
        ticket.put("delhi", "goa");

        String start=getstart(ticket);
        System.out.print(start);
        for(String key : ticket.keySet()){
            System.out.print("->"+ticket.get(start));
            start=ticket.get(start);
        }
        System.err.println();

    }
    
}
