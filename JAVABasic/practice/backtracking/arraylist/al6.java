package practice.backtracking.arraylist;

import java.util.ArrayList;

public class al6 {
public static int storewater(ArrayList<Integer>height){
    int maxwater=0;
    int lp=0;
    int rp=height.size()-1;
    while(lp<rp){
        int ht=Math.min(height.get(lp),height.get(rp));
        int width=rp-lp;
        int curr=ht*width;
        maxwater=Math.max(maxwater,curr);
        if(height.get(lp)<height.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
    }
    return maxwater;
}


    public static int mostwater(ArrayList<Integer>height){
       int maxheight=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
           int htt=Math.min(height.get(i),height.get(j));
           int width=j-i;
           int water=htt*width;
           maxheight=Math.max(maxheight, water);

            }
        }
        return maxheight;
    }
    public static void main(String args[]){
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);     
        height.add(7);   

        
        // System.out.println(mostwater(height));
        System.out.println(storewater(height));

    }
}
