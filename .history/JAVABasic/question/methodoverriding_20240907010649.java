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
        A a=new A();
        A b=new B();
        System.out.println();
    }
    
}
