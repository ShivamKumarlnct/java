class Cat {
    int eat(int a, int b) {
        return a+b;
    }
}

class Dog extends Cat {
    // @Override
    // void eat() {
    //     System.out.println("Non veg and veg Both");
    // }
}

public class Overriding {
    public static void main(String[] args) { // Corrected method signature
        Dog d = new Dog();
        d.eat();
    }
}
