package practice.backtracking.arraylist;

import java.util.ArrayList;

public class al1 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        // operation
        // 1>add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        // 2>add element as paticular index
        list.add(1,5);
        System.out.println(list);//one value or one index increase in list using add

        // 3>get element
       int gets= list.get(1);//it is used for get the index value
        System.out.println(gets);

        // 4>remove element
        int removes=list.remove(4);
        System.out.println(removes);

        // 5>set element at index
        list.set(2, 10);
        System.out.println("set element:"+list);

        // 6>contains element:it means value exits in the array or not
        boolean value=list.contains(4);
        System.out.println(value);
// how to write loop
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
    
}
