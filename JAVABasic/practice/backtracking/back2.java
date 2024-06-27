package practice.backtracking;

public class back2 {
    public static void subset(String str,String ans,int i){
        // base
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        // recursive yes
        subset(str, ans+str.charAt(i), i+1);
        // no
        subset(str, ans, i+1);

    }
    public static void main(String args[]){
        String str="abc";
        String ans="";
        subset(str,ans,0);
    }
    
}
