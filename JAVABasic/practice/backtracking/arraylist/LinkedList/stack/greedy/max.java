package practice.backtracking.arraylist.LinkedList.stack.greedy;

public class max {
    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        int l=0,r=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='L'){
                    l++;
            }
            else if(str.charAt(i)=='R'){
                r++;
            }
            if(l==r){
                ans++;
            }
        }
        System.out.println("find the max partision equl to L and R:"+ans);
    }
    
}
