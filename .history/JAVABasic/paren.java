import java.util.*;

class paren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ss = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (depth > 0) {
                    ss.append('(');
                }
                depth++;
            } else if (s.charAt(i) == ')') {
                depth--;
                if (depth > 0) {
                    ss.append(')');
                }
            }
        }
        System.out.print(ss);
    }
}
