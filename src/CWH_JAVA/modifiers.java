package CWH_JAVA;
import java.util.*;
class employee{
    private String name;
    private int id;
    public String getname(){
        return name;
    }
    public void setname(String a){
        name = a;
    }
    public int getempid(){
        return id;
    }
    public void setid(int i){
        id = i;
    }
}
public class modifiers{
    public static void main(String...args){
        employee e = new employee();
        e.setname("Chennai");
        e.setid(101);
        System.out.println(e.getname());
        System.out.println(e.getempid());

    }
} 

// package CWH_JAVA;
// import java.util.*;
// class Student {
//     private String name ;
//     private long regnum;
//     public String printname(){
//         return name;
//     }
//     public Long printregnum(){
//         return regnum;
//     }
//     public void getname(String nm){
//         Scanner in = new Scanner (System.in);
//         name = nm;
//     }
//     public void getregnum(long reg){
//         regnum = reg;
//     }
// }
// public class modifiers{
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Student s1 = new Student();
//         System.out.println("Enter the name of the student :");
//         s1.getname("Sriyansu ");
//         s1.getregnum(224100419);
//         System.out.println("Name : "+s1.printname());
//         System.out.println("Reg : "+s1.printregnum());

//     }
// }