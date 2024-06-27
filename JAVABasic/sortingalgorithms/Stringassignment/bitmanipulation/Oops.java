package sortingalgorithms.Stringassignment.bitmanipulation;

import sortingalgorithms.Stringassignment.bitmanipulation.Animal.horse;

public class Oops {
    public static void main(String args[]){
      //polymorpism,method overloading(static)
// calculator clc=new calculator();
// System.out.println(clc.sum(1,2));
// System.out.println(clc.sum(1,2,5));
// System.out.println(clc.sum((float)1.3,(float)2.2));


// //polymorphism ,method overreading
// deer d=new deer();
// d.eat();
// Animal ani=new Animal();
// ani.eat();

//     }
//     }

// //polymorphism ,method overreading
// class Animal{
//   void eat(){
//     System.out.println("eat anything");
//   }
// }
// class deer extends Animal{
//   void eat(){
//     System.out.println("eat grass");
//   }
// }








// ---------------------------------------

//     //polymorpism,method overloading(static)

// class calculator{
//   int sum(int a,int b){
//     return a+b;
//   }
//   float sum(float a,float b){
//     return a+b;
//   }
//   int sum(int a,int b,int c){
//     return a+b+c;

//   }
// }
// -----------------------------------
      //constructor

      // student s1 =new student(); //non-parameter
      // student s2=new student("shivam");//this is parameter
      // System.out.println(s2.name);
      // student s3=new student(123);
      // System.out.println(s3.roll);

      //copy

  //     student s1=new student();
  //     s1.name="shivam";
  //     s1.roll=123;
  //     s1.password="abcd";
  //     s1.marks[0]=100;
  //     s1.marks[1]=90;
  //     s1.marks[2]=80;

  //     student s2=new student(s1);
  //     s2.password="xyz";
  //     s1.marks[2]=100;
  //     for(int i=0;i<3;i++){
  //       System.out.println(s2.marks[i]);
  //     }


  //     // System.out.println(s2.marks);

  //   }
  // }
  // class student{
  //   String name;
  //   int roll;
  //   String password;
  //   int marks[];

    //shallow copy constructor

    //   student(student s1){
    //    marks=new int[3];
    //   this.name=s1.name;
    //   this.roll=s1.roll;
    //   this.marks=s1.marks;
      
    // }
    //this is non-parameter

  //   student(student s1){
  //   marks=new int[3];
  //   this.name=s1.name;
  //   this.roll=s1.roll;
  //   for(int i=0;i<marks.length;i++){
  //     this.marks[i]=s1.marks[i];
  //   }

  //   }
  //   student(){//constructor
  //    marks=new int[3];
  //     System.out.println("constructor is called..."); 
  //   }

  //   //this is parameter constructed
  //   student(String name){
  //         marks=new int[3];
  //   this.name=name;
  //   }
  //   student(int roll){
  //         marks=new int[3];
  //     this.roll=roll;
  //   }
    
  // }-----------------------------------------
          // this is encapsulation

//         Pen p1=new Pen();
//         p1.setColor("orange");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println("this is a tip of pen:"+p1.gettip());
//         p1.setColor("green");
//         System.out.println(p1.getColor());

//     }
    
// }
// class Pen{
//   private  String color;
//    private int tip;                  // this is encapsulation

//     String getColor(){
//         return this.color;
//     }
//     int gettip(){
//         return this.tip;
//     }

//     void setColor(String newColor){
//       this.color=newColor;
//     }
//     void setTip(int newTip){
//       this.tip=newTip;
//     }
// }




// class Pen{
//     String color;
//     int tip;

//     void setColor(String newColor){
//         color=newColor;
//     }
//     void setTip(int newTip){
//         tip=newTip;
//     }
// }
// ----------------------abstract---------
//  Horse h= new Horse();
//   h.eat();
//   h.walk();
// System.out.println(h.Color);
//   Chicken c= new Chicken();
//     c.eat();
//     c.walk();
//     System.out.println(c.Color);
// mustang myhorse=new mustang();

//   }
// }

//  abstract class Animal{
  
//   String Color;
//       Animal(){
//         System.out.println("animal constructor is called");
//         Color="brown";
//  }

//    void eat(){
//     System.out.println("animal eats");
//    }
//       abstract void walk();
//  }
//       class Horse extends Animal{
//         Horse(){
//           System.out.println("horse is constructor called");
//         }
//         void changeColor(){
//          Color= "brown";
//         }
//         void walk(){
//           System.out.println("horse is walk with 4 legs");
//         }
//       }
      
//       class mustang extends Horse {
//         mustang() {
//           System.out.println("mustang is constructor called");
//         }
//       }

//       class Chicken extends Animal{
//         Chicken(){
//           System.out.println("chicken is constructor called");
//         }
//         void changeColor() {
//           Color="light brown";
//         }
//         void walk(){
//           System.out.println("chicken has two legs");
//         }
//       }
      
// -----------------interface---------------------
// Queen q = new Queen();
// Rook r = new Rook();
// q.moves();
// r.moves();
// }
// }

//   interface ChessPlayer{
//    void moves();
//   }
//   class Queen implements ChessPlayer{
//         public void moves(){
//           System.out.println("up,down,right,left,(move all direction)");
//         }
//   }

//   class Rook implements ChessPlayer {
//     public void moves() {
//       System.out.println("move horizontal,vertical (without jump)");
//     }
//   }
   
//   class Knight implements ChessPlayer {
//     public void moves() {
//       System.out.println("moves two square vertical and one square horizontal");
//     }
//   }
  
//   class bishop implements ChessPlayer {
//     public void moves() {
//       System.out.println("moves diagonals");
//     }
//   }
  
//   class pawn implements ChessPlayer {
//     public void moves() {
//       System.out.println("it moves one square directily forword");
//     }
//   }

// -----------static---------
// student s1=new student();
// s1.schoolName="bvm";
// s1.name="shivam";
// s1.roll=127;
// System.out.println(s1.roll +" "+s1.name);
// student s2=new student();
// System.out.println(s2.schoolName);
//     }
//   }
//   class student{
//     static String schoolName;
//     int roll;
//     String name;


//     void setname(String name){
//           this.name=name;
//     }
//           String getname(){
//          return this.name;
//     }
//     void setroll(int roll){
//       this.roll=roll;
//     }
//     int getroll(){
//       return this.roll;
//     }
//   }


// ----------super------
  Horse h=new Horse();
  System.out.println(h.color);
    }
  }
  class Animal{
    String color;
    Animal(){
      System.out.println("this is animal");
    }
  }
    class Horse extends Animal{
      Horse(){
        super.color="brown";
        System.out.println("this is horse");
      
    }
  }