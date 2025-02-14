class A {
    A() { // Constructor of class A
        System.out.println("hello");
    }
}

class B extends A {
    void print() {
        System.out.println("this is me");
    }
}

public class ConstructorExample { // Class name should start with a capital letter
    public static void main(String[] args) { // Corrected method signature
        B a = new B(); // Creates an instance of class B
        a.print(); // Calls the print method of class B
    }
}
