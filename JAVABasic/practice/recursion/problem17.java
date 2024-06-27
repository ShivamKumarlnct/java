package practice.recursion;

public class problem17 {   
    public static int find(String s){
        if(s.length()==0){
            return 0 ;
        }
        return find(s.substring(1))+1;
    }
     public static void main(String args[]){
        String s="shivam";
        int count=0;
        // find(s,count);
        System.out.println(find(s));
    }
    
}
