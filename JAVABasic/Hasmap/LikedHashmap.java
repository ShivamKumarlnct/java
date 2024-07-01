package Hasmap;
import java.util.*;

public class LikedHashmap {
    public static void main(String args[]){
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("india", 123);
        lhm.put("indonesia", 423);
        lhm.put("china", 123);
        lhm.put("america", 123);

        System.out.println(lhm);


}    
}
