package practice;

public class problems18 {
    public static void main(String args[]){
        String str="HELLEH";
         boolean is=true;
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        char ch1=str.charAt(str.length()-i-1);
        if(ch!=ch1){
            is =false;
            break;
        }
    }
if(is){
    System.out.println("this is pallindrom");
}
else{
    System.out.println("this is not pallindrom");
}
}
}
