package practice.backtracking.arraylist.LinkedList.stack.greedy;
import java.util.Arrays;
import java.util.Comparator;

public class knapship {
    public static void main(String args[]) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finVal += val[idx];//60+100=160
                capacity -= weight[idx];//50-10=40/40-20=20
            } else {
                finVal += (ratio[i][1] * capacity);//160+(120/30)*20=240
                capacity=0;
                break;
            }
        }
        System.out.println("final value:" + finVal);
    }
}
