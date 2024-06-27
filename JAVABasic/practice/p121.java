package practice;
public class p121{
    public static void findlength(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()-1;j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
           System.out.println(count);

        
    }
    public static void main(String args[]){

        String s = "abcabcbb";
        findlength(s);
        // System.out.println();/


// ---------------------
        // String str="shivam";
        // String str1="situv";
        // // String str[]={"shivam","situv"};
        // for(int i=0;i<str.length();i++){
        //     for(int j=0;j<str1.length();j++){
        //         if(str.charAt(i)==str1.charAt(j)){
        //             System.out.println(str.charAt(i));
        //         }
             
        //     }
          
        // }

        // ---------------using Array----
        // String str[]={"shivam","situva","gupta"};
        // for(int i=0;i<str.length;i++){
        //     for(int j=0;j<str[i].length();j++){
        //         for(int k=0;k<str[i+1].length();k++){
        //             if(str[i].charAt(j)==str[i+1].charAt(k)){
        //                 System.out.println(str[i].charAt(j));
        //             }
        //         }
        //     }
        // }

        // -----------------
        // String str="shivamu";
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='i'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        //         System.out.println(str.charAt(i));
        //     }
        // }
            // String str="jpnacollege";
            // String str1=str.replace("j","a");
            //  System.out.println(str1);

           
            
        }
        }

    

