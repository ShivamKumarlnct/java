package practice;

public class problems19 {
    public static void main(String args[]){
        String str="acr";
        String str1="rca";
        boolean is=true;
        for(int i=0;i<str.length();i++){
            is=true;
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)!=str1.charAt(j)){
                    is=false;
                }
                else{
                    is=true;
                    break;
                }
               
            }
        }
        if(is){
            System.out.println("this is anagram");
        }
        else{
            System.out.println("this is not anagram");
        }

    }
}
