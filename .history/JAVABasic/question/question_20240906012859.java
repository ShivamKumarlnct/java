
class person {
    int age;
    String name;

    person() {
        this.age = 21;
        this.name = "shivam";
    }

    void print() {
        System.out.println(name + " " + age);

    }
}

class B extends person {
    void add() {
        System.out.println(super.age);
    }
}

public class question {
    public static void main(String args[]) {
        B a = new B();
        a.print();
        a.add();

    }
}
