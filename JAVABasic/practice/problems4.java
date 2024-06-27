package practice;

public class problems4 {
    public static boolean check(String s){
        int leftcount=0;
        int startcount=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                leftcount++;
            }else if(c==')'){
                startcount++;
            }
            else{
                if(leftcount>0){
                    leftcount--;
                }else if(startcount>0){
                    startcount--;

                }
                else{
                    return false;
                }
            }
        }
        if(leftcount>startcount){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(check("()"));
    }
    
}
