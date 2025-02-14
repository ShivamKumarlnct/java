package question;
class A{
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b,float cf) {
        return a + b + cf;
    }
}


public class methodoverloading {
    public static void main(String args[]){
        A a =new A();
        System.out.println(a.add(2, 3));
        System.out.println(a.add(2, 3,23.3f));

    }
    
}
