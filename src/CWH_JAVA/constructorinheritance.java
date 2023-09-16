package CWH_JAVA;
import java.util.*;
class base{
    base(){
        System.out.println("This is base class constructor ");
    }
    base(int a){
        System.out.println("The base class number is "+a);
    }
}
class derive extends base{
    derive(){
        System.out.println("This is derive class constructor");
    }
    derive(int b){
        super();
        System.out.println("This is derive class number "+b);
    }
}
public class constructorinheritance{
    public static void main(String[] args) {
        base obj = new derive(6);
       
    }
}