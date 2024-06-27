package practice;

public class problem26 {
    public static void main(String args[]){
        String str[]={"abcabcaaaa","shiama"};

        for(int i=0;i<str.length;i++){
            int count = 0;

            for(int j=i;j<str[i].length()-1;j++){
                if (str[i].charAt(j) == 'a') {
                    count++;
                }
            }
            System.out.println(count);
          

        }
    }
    
}
