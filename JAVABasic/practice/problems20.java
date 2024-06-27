package practice;

public class problems20 {
    public static char findmaxduplicate(String str){
        int max=Integer.MIN_VALUE;
       char res = '\0';
       StringBuffer str1=new StringBuffer();
        for(int i=0;i<str.length();i++){
            int count = 0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)!=str.charAt(j))
                    break;
                    count++;
                
            }
            if(count>max){
                max=count;
                res=str.charAt(i);
            }
        }
        return res;
    }
   public static void main(String args[]){
    String str="aaabbcccccc";
    findmaxduplicate(str);

    System.out.println(findmaxduplicate(str));

   }
    }

