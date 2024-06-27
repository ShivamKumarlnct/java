package practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.revise;

import practice.backtracking.arraylist.LinkedList.stack.greedy.binarytree.identical;

public class loop {
    public static void main(String args[]){
    //    int sum=0;
    // for(int i=0;i<=10;i++){
    //     sum=sum+i;
    // }
    // System.out.println(sum);

// ----------------------------
// for(int i=1;i<=10;i++){
//     System.out.println("2"+"*"+i+"="+2*i);
// }
// --------------odd/even-----------
// for(int i=0;i<=10;i++){
//     if(i%2==0){
//         System.out.println("even="+ i);
//     }else{
//         System.out.println("odd="+ i);
//     }

// }

// ------------------pallindrom---------------
// int n=212;
// int rev=0;
// int rem;
// while(n>0){
//     rem=n%10;
//     rev=rev*10+rem;
//     n=n/10;
// }
// System.out.println("pallndrom:"+ rev);

// -----------------reverse------------
//  int n=1021;
//  int rev=0;
//  int rem;
//  while(n>0){
//     rem=n%10;
//     rev=rev*10+rem;
//     n=n/10;
//  }
//  System.out.println(rev);

// ----------------prime----------
int n=5;
for(int i=2;i<=10;i++){
    if(n%i!=0){
        System.out.println("not=" + i);
    }
    else{
        System.out.println("prime="+ i);
    }
}

    }
    
}
