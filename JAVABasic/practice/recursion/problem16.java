package practice.recursion;

public class problem16 {
    public static void main(String args[]){
        int rev=0;
        int n=2019;
        int temp=n;
        String str[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine" };
        while(n>0){
            int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
        }
        System.out.println(rev);
        while(rev>0){
            int last=rev%10;
           for(int i=0;i<str.length;i++){
            if(last==i){
                System.out.print(temp+":"+str[i]+" ");
            }
           }
           rev=rev/10;
    }
    }}
    
    

