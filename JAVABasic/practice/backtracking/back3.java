package practice.backtracking;

public class back3 {
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.print(ans +" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permutation(newstr, ans+curr);
        }
    }
    public static void main(String args[]){
        // permutation
        String str="abc";
        String ans="";
        permutation(str,ans);
    }
    
}
