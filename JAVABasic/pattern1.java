public class pattern1 {//print the pattern problem
    public static void main(String args[]){
        //i=line j=star
        // for(int i=1;i<=4;i++){//outer line
        //     for(int j=1;j<=i;j++){//inner line
        //         System.out.print("s");//print s
            // }
                    // System.out.println();//creat space and  break line

        // }
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n=4;
        // for(int i=1;i<=n;i++){//i is line
        //     for(int j=1;j<=i;j++){//j is number
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        char ch ='A';
        for(int i=1;i<=4;i++){
            for(int chars=1;chars<=i;chars++){//in the java not used in the loop char only used chars
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
