package practice;

public class pract2 {
    static int sums = 0; // Declare sums as a static variable

    public static int sum(int n, int idx) {
        if (idx == n) {
            sums += idx;
            return sums;
        }
        sums += idx;
        return sum(n, idx + 1);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(sum(n, 0));
    }
}
