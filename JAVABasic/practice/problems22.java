package practice;

public class problems22 {
    public static void main(String args[]) {
        String str[] = { "flower", "flow", "flight" };
        StringBuilder str1 = new StringBuilder();
      
        for (int j = 0; j < str[0].length(); j++) {
            char ch = str[0].charAt(j);
            for (int i = 1; i < str.length; i++) {
                if (str[i].charAt(j) != ch) {
                    System.out.println(str1.toString());
                    return;
                }
            }
            str1.append(ch);
        }
        System.out.println(str1.toString());
    }
}
