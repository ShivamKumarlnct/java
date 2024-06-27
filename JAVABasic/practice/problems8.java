package practice;

public class problems8 {
    public static void main(String args[]) {
        String str = "My name is #SKR@123";
        int countspace = 0;
        int countvowel = 0;
        int countsymbol = 0;
        int countupper = 0;
        int countlower = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                countspace++;
            } 
             else if (ch == '@' || ch == '#' || ch == '$') {
                countsymbol++;
            } else if (ch >= 'A' && ch <= 'Z') {
                countupper++;
            } else if (ch >= 'a' && ch <= 'z') {
                countlower++;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countvowel++;
            }
           
            
        }
        System.out.println("count space: " + countspace);
        System.out.println("count vowel: " + countvowel);
        System.out.println("count symbol: " + countsymbol);
        System.out.println("count uppercase: " + countupper);
        System.out.println("count lowercase: " + countlower);
    }
}
