package practice;

public class problems25 {
    public static boolean valid(String str) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch == '(' && ch == ')') || (ch == '[' && ch == ']') || (ch == '{' && ch == '}')) {
                s1.append(str);
            }
            System.out.println(s1);
            // else if(s1.charAt(i)==ch){
            //     return true;
            // }
        }
        
        return false;
    }

    public static void main(String args[]) {
        String str = "()";
        System.out.println(valid(str));
    }
}
