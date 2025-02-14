package question;
class A{
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b,float c) {
        return a + b + c;
    }
}


public class methodoverloading {
    public static void main(String args[]){
        A a =new A();
        System.out.println(a.add(2, 3));
        System.out.println(a.add(2, 3,));

    }
    
}
