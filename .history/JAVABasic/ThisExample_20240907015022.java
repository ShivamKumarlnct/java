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
        super.print(); // Initialize the variables in superclass A
        System.out.println(super.age); // Access superclass variables using super
        System.out.println(super.name);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        B b = new B(); 
        b.print(); // Call the overridden print method
    }
}
