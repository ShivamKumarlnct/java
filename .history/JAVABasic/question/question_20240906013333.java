package question;
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
        int age=5;
        System.out.println(super.age);
        System.out.println(age);
    }
}

public class question {
    public static void main(String args[]) {
        B a = new B();
        a.print();
        a.add();

    }
}
