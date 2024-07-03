package Hasmap;
import java.util.*;

public class treeset {
    public static void main(String args[]){
        HashSet<String>hs=new HashSet<>();//hashset
        hs.add("bihar");
        hs.add("uttar-pardesh");
        hs.add("bengal");
        hs.add("rajsthan");

        System.out.println(hs);
// linked
LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("bihar");
        lhs.add("uttar-pardesh");
        lhs.add("bengal");
        lhs.add("rajsthan");

        System.out.println(lhs);

        // treeset
        TreeSet<String>ts=new TreeSet<>();
        ts.add("bihar");
        ts.add("uttar-pardesh");
        ts.add("bengal");
        ts.add("rajsthan");

        System.out.println(ts);


    }
    
}
