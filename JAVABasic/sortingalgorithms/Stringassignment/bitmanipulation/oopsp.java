package sortingalgorithms.Stringassignment.bitmanipulation;

public class oopsp {
     static class Animal{
        void eat(){
            System.out.println("eat mango");
        }
    }
       static class cow extends Animal{
        void eat(){
            System.out.println("eat grapes");
        }
    }

    public static void main(String args[]) {
        Animal a=new Animal();
        a.eat();
        cow c=new cow();
        c.eat();
    }
}
 
    //encapsulation
//     public static void main(String args[]){
//         Address a1=new Address();
//         a1.location="anana";
//         a1.pin=123;
//         System.out.println(a1.location);
//         System.out.println(a1.pin);
//     }
// }
// class Address{
//     String location;
//     int pin;

//     void setlocation(String newlocation){
//         this.location=newlocation;
//     }
//         void setpin(int newpin){
//             this.pin=newpin;
        
//     }

//constructor
// public static void main(String args[]){
// Address a1=new Address();
//    a1.location="anan";
//    a1.pin=123;
// }
// class Address{
//     String location;
//     int pin;

//     Address(){
// this.location=location;
// this.pin=pin;

//     }
// }

//inheritance


// Fish shark=new Fish();
// shark.eat();
// Dog bread=new Dog();
// bread.eat();
// bread.legs=4;
// System.out.println(bread.legs);
//   mammels dog=new mammels();
//    dog.eat();
//    dog.walk();
//    bird squar=new bird();
//    squar.breath();
//    squar.fly();
//    tuna fsu=new tuna();
//    fsu.veryfast();
//     fsu.swim();
// }
// }

//     class Animals{
//         String color;
//         void eat(){
//             System.out.println("eat");
//         }
//         void breath(){
//             System.out.println("breath");
//         }
//     }
    // class Fish extends Animals{
    //     int fins;
    //     void swim(){
    //         System.out.println("swims");
    //     }
    // }
    // class mammels extends Animals{
    //     void walk(){
    //         System.out.println("walks");
    //     }
    // }
    // class bird extends mammels{
    //     void fly(){
    //         System.out.println("birds fly");
    //     }
    // }
    // class fish extends mammels{
    //     void swim(){
    //         System.out.println(" swim fish");
    //     }
    // }
    // class tuna extends fish{
    //     void veryfast(){
    //         System.out.println("more");
    //     }
    // }



// -------------------
// Bear b = new Bear();
// b.eatGrass(); // Call the eatGrass method from the Herbivore interface
// b.eatMeat(); // Call the eatMeat method from the Carnivore interface
// }
// }

//     interface Herbivore {
//     void eatGrass();
// }

// interface Carnivore {
//     void eatMeat();
// }

// class Bear implements Herbivore, Carnivore {
//     public void eatGrass() {
//         System.out.println("Bear is eating grass.");
//     }

//     public void eatMeat() {
//         System.out.println("Bear is eating meat.");
//     }
// }

//Q1
//  ----------question--------------
// student s=new student();
// s.name="shivam";
// System.out.println(s.name);

// }
// }
// class student{
//     String name;
//     int roll;    
// }

// // Q2
// student p=new student();
// p.weight=11;
// p.rollno=1;
// System.out.println(p.weight);

// person s=new student();
// s.weight=11;
// s.name="";
// s.rollno=1;


// }
// }//person send data student but student not send our data to person so not access

// class person{
//     int weight;
//     String name;
// }
// class student extends person{
//     int rollno;
//     String schoolname;
// }

// Q3
// vehicle c = new car();
// c.print();//function overriding
// vehicle v=new vehicle();
// v.print1();
// car c=new car();
// c.print1();

// }
// }
// class vehicle{
// void print(){
//     System.out.println("this is base class");
// }
// }
// class car extends vehicle{
//     void print1(){
//         System.out.println("this is derived class");
//     }

// }

    //    ---------------------------
//     Test t = new Test();
//     t.set_marks(98);
//     System.out.println(Test.marks(98));

// }
// }

// class Test{
//     static int marks;
//     void set_marks(int marks){
//         this.marks=marks;
//     }
// }
// ------------------
// Test t=new Test();
//     t.ChangeB();
//     System.out.println(Test.a+Test.b);
// }
// }
// class Test{
//     static int a=10;
//     static int b;
//     static void ChangeB(){
//         b=a*3;
//     }
// }


// Q1:Printthesum,differenceandproductoftwocomplexnumbersbycreatingaclassnamed
// 'Complex'withseparatemethodsforeachoperationwhoserealandimaginaryparts are entered by the user

// Complex c=new Complex();
// c.sum();
// c.difference();
// }
// }
// class Complex{
//     static int a=30;
//     static int b=20;
//     void sum(){
//         System.out.println("a+b="+(a+b));
//     }

//     void difference(){
//         System.out.println("a-b="+(a-b));
    


// Q3 ---------------
