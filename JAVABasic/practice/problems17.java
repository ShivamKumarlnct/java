package practice;

import java.lang.reflect.Array;
import java.util.*;

public class problems17 {
    public static void permutation(int arr[],int index){
        if(index==arr.length-1){
            System.out.println(arr.toString(arr));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            swap(arr, index, i);
            permutation(arr, index+1);
            swap(arr, index, i);
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        int index=0;
        permutation(arr, index);
   
        
        
        }
        
    }
    

