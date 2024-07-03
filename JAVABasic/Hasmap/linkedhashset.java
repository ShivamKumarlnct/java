package Hasmap;
import java.util.*;

public class linkedhashset {
    public static void main(String args[]){
    HashSet<String>hs=new HashSet<>();
        hs.add("shivam");
        hs.add("shivam kumar");
        hs.add("shivam kumar gupta");
        hs.add("shivam kumra gupta madsheya");
        hs.add("shivam kumar gupta madsheya kanu ");

        System.out.println(hs);


        LinkedHashSet<String>lhs=new LinkedHashSet<>();//it is ordered 
        lhs.add("shivam");
        lhs.add("shivam kumar");
        lhs.add("shivam kumar gupta");
        lhs.add("shivam kumra gupta madsheya");
        lhs.add("shivam kumar gupta madsheya kanu ");

        System.out.println(lhs);

    }
    
}
