class A {
    int age;
    String name;

    void print() {
        this.age = 21;
        this.name = "shivam";
    }
}

class B extends A {
    @Override
    void print() {
        super.print(); 
        System.out.println(super.age); 
        System.out.println(super.name);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        B b = new B(); 
        b.print(); 
    }
}
