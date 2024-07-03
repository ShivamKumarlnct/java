package Hasmap;
import java.util.*;


public class Hashset {
    public static void main(String args[]){
        HashSet<Integer>hs=new HashSet<>();

        // add

        hs.add(3);
        hs.add(2);
        hs.add(1);
        hs.add(5);
        hs.add(3);
        hs.add(1);
        System.out.println(hs);

        // size
        System.out.println("size of hs:"+hs.size());

        // clear
        hs.clear();
        System.out.println(hs);

      //remove

        hs.remove(3);

        // contains
        if(hs.contains(3)){
            System.out.println("contains 3");
        }
        if(hs.contains(4)){
            System.out.println("contains 4");
        }

    }
    
}
