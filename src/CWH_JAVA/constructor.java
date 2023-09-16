package CWH_JAVA;
import java.util.*;
class clas  {
    String name ;
    long rollno;
    int age;
    public clas (String nm , long roll , int a){
        this.name = nm;
        this.rollno = roll;
        this.age = a;
    }
}
public class constructor{
    public static void main(String[] args) {
        clas obj = new clas ("Sriyansu",224100419,14);
        System.out.println("Name of the Student "+obj.name);
        System.out.println("Rollno of the student "+obj.rollno);
        System.out.println("Age of the studewnt "+obj.age);
    }
}

// package CWH_JAVA;
// import java.util.*;
// class Std{
//     String name;
//     long regnum;
//     int age;
//     Std(String nm , long reg , int a){
//         this.name = nm;
//         this.regnum = reg;
//         this.age = a;
        
//     }
// }
// public class constructor{
//     public static void main(String[] args) {
//     Std obj = new Std("Sriyansu",224100419,19);
//     System.out.println("Name of the Student "+obj.name);
//     System.out.println("Rollno of the student "+obj.regnum);
//     System.out.println("Age of the studewnt "+obj.age);

//     }
// }