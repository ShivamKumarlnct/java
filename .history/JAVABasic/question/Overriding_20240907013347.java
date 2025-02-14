package question;

class Cat {
    void eat() {
        System.out.println("Non veg");
    }
}

class Dog extends Cat {
    @Override 
    void eat() {
        System.out.println("Non veg and veg Both");
    }
}

public class Overriding {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat(); 
    }
}
