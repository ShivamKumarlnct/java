public class forloop {
    public static void main(String args[]){
      //Q1 print shivam n times
        // for(int i=1;i<=10;i++){
        //     System.out.println(i+"=shivam");
        // }
        //Q2print square pattern
        // for(int line=1;line<=4;line++){
        //     System.out.println("****");

        //Q3 reverse 
        int n=12345;
        while(n>0){//it is find the jb tk n ka value 0 se bada hai tb tk condition apply hoga
        int lastdigit=n%10;//yeh n value ka last digit le rha hai
        System.out.print(lastdigit);
        n=n/10;//or yeh last value htane ke baad jo value hai uska module nikal rha hai
        }
        }
    }
    

