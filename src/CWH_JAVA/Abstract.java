package CWH_JAVA;
import java.util
.*;
abstract class Student1{
    
    String name ;
    int age ;
    Student1(){
        System.out.println("Hii I am Student 1");
    }
    public void display(){
        System.out.println("This is a message from Student1 to display ");
    }
   abstract void greet();
   abstract void greet1();
   
}
class Cls extends Student1{
   
    void greet(){
        System.out.println("This is greet 0 from student 1");
    }
    void greet1(){
        System.out.println("This is greet 1 from student 1");
    }
}
abstract class Student2 extends Cls{
    public void hi(){
        System.out.println("Student 2 is saying Hii to Abstract class");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Cls obj = new Cls();
        obj.greet();    
    }
}


// package CWH_JAVA;
// import java.util.*;
// abstract class Student {
//     int roll;
//     String name ;
//     // public String getName() {
//     //     return name;
//     // }
//     // public void setName(String name) {
//     //     this.name = name;
//     // }
//     public String setName(){
//         return name;
//     }
//     public void getName(String n){
//         this.name = n;
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter name : ");
//         n = in.next();
//     }
// }
// class Cls extends Student{
//     public void display(){
//         System.out.println("Name is "+setName());
//     }
// }
// public class Abstract{
//     public static void main(String[] args) {
//     Cls obj = new Cls ();
//     obj.display();
//     }
// }