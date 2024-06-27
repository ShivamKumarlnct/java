package practice;

public class problem {
    public static void main(String args[]) {
        String str[] = {"shivam", "kumar" };
        String str1[]={"sk"};
        // Print the first letter of each string
        for (int i = 0; i < str.length; i++) {
            if(str[i].charAt(0) == str1[0].charAt(i)){
                System.out.println("similar");
            }
            else{
                System.out.println(" not");
            }
        }
        
    }
}
