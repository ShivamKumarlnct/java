package practice.recursion;

public class problem13 {
    public static void duplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            duplicate(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            duplicate(str, idx + 1, newstr.append(currchar), map);
        }

    }
    public static void main(String args[]){
        String str="appnnacollege";
        // StringBuilder newstr;
        // int idx;
        // boolean map[];
       duplicate(str,0,new StringBuilder(""),new boolean[26]); 
    } 
    
}
