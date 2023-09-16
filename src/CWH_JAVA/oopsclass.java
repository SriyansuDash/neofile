// package CWH_JAVA;
// import java.util.*;
// class Emp{
//     String name;
//     int empid;
//     void getdetails(){
//     Scanner in = new Scanner (System.in);
//     System.out.println("Enter Employee name ");
//     name = in.nextLine();
//     System.out.println("Enter empid of employee ");
//     empid = in.nextInt();
//     }
//     void printdetails(){
//        System.out.println("Employee Name : "+name);
//        System.out.println("Employee id is "+empid);
//     }
// }
// public class oopsclass{
//     public static void main(String[] args){
//       Emp e1 = new Emp();
//       e1.getdetails();
//       Emp e2 = new Emp();
//       e2.getdetails();
//       Emp e3 = new Emp();
//       e3.getdetails();
//       e1.printdetails();
//       e2.printdetails();
//       e3.printdetails();
//     }
// }

package CWH_JAVA;
import java.util.*;
class emp{
    String name;
    long empid;
    int age;
    static String getnames(String name){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter name of employee ");
        return name =in.nextLine();
    }
    static long getempid(long empid){
        System.out.println("Enter emp id ");
        Scanner in = new Scanner (System.in);
        return empid = in.nextLong();
    }
    static int getage(int age){
        System.out.println("Enter age of employee ");
        Scanner in = new Scanner (System.in);
        return age = in.nextInt();
    }
    void printdetails(){
        System.out.println("Name of the employee is "+name);
        System.out.println("Employee id is "+empid);
        System.out.println("Age of the employee is ");
    }
}
public class oopsclass{
    public static void main(String[] args) {
        // emp e1 = new emp();
        // e1.name = emp.getnames(e1.name);
        // e1.empid = emp.getempid(e1.empid);
        // e1.age = emp.getage(e1.age);
        // emp e2 = new emp();
        // e2.name = emp.getnames(e2.name);
        // e2.empid = emp.getempid(e2.empid);
        // e2.age = emp.getage(e2.age);
        // emp e3 = new emp();
        // e3.name = emp.getnames(e3.name);
        // e3.empid = emp.getempid(e3.empid);
        // e3.age = emp.getage(e3.age);
        // e1.printdetails();
        // e2.printdetails();
        // e3.printdetails();
        for(int i=1;i<4;i++){
            emp e = new emp();
            e.name = emp.getnames(e.name);
            e.empid = emp.getempid(e.empid);
            e.age = emp.getage(e.age);
            e.printdetails();
        }
        
    }
}