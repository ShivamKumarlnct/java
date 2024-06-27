public class function3 {
    //m1
    // public static void Primeno(int n){
    //     boolean isprime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //         isprime=false;
    //         }
    //     }
    //         if(isprime==true){
    //             System.out.println("prime");
    //         }
    //         else{
    //             System.out.println("not prime");
            
    //     }
    // }
    //m2
public static boolean isprime(int n){
    // if(n==2){
    //     return true;
    // }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
       
    }
     return true;
}
    public static void PrimesInrange(int n){
        for(int i=2;i<=100;i++){
            if(isprime(i)){
                System.out.println(i+"is prime");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // boolean isprime=true;
        // Primeno(n,isprime);
       
    //    System.out.println(isprime(n));
        PrimesInrange(100);
    }
}
    

