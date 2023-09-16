package CWH_JAVA;
import java.util.*;
class A{
    public int a ;
    public int num(){
        return 4;
    }
    public void meth2(){
        System.out.println("This is meth2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("This is meth2 of class B ");
    }
    public void meth3(){
        System.out.println("This is meth3 of class B");
    }
} 
public class methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
        b.meth3();
    }
}
