package practice;

public class problem21 {
    public static int leng(String str,int i,int n){
        if(i==n){
            return i ;
        }
       return leng(str, i+1, n);
        

    }
    
    public static void main(String args[]){
       String str="my name is shivam";
       int n=str.length();
      
       System.out.println(leng(str, 0, n));
    }
    
}
