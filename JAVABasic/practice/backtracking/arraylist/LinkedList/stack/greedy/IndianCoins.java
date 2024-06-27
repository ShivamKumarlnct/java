package practice.backtracking.arraylist.LinkedList.stack.greedy;
import java.util.*;

public class IndianCoins {
    public static void main(String args[]) {
        int value = 590;
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int minCoins = 0;
        ArrayList<Integer>ans=new ArrayList<>();
        Arrays.sort(coins,Comparator.reverseOrder());
        int n = coins.length;

        for (int i =1; i < n; i++) {
            if(coins[i]<=value){
                while(coins[i]<=value){
                    minCoins++;
                    ans.add(coins[i]);//optional
                    value=value-coins[i];
                }
            }

        }
        System.out.println("minCoins: " + minCoins);
        for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
