package question;
class A{
    int add(int a,int b){
        return a+b;
    }
}
class B extends A{
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class methodoverriding {
    public static void main(String args[]){
        B a=new B();
        A b=new B();
        System.out.println(a.add(1, 2));
        System.out.println(b.add(1, 2,5));
    }
    
}
