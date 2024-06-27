package practice;
public class problems3 {
    public static void main(String args[]) {
        String str = "leEeetcode";
        String str1 = "leetcode";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            for (int j = 0; j < str1.length(); j++) {
                char ch2 = str1.charAt(j);
                if (ch1 == ch2) {
                    System.out.print(ch1 + " ");
                    break;
                }
            }
        }
    }
}
