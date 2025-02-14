package question;
class A{
    int add(int a,int b){
        return a+b;
    }
}
class B {
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class methodoverriding {
    public static void main(String args[]){
        A x=new A();
        B y=new B();
        System.out.println(x.add(1, 2));
        System.out.println(y.add(1,2,5));
    }
    
}
