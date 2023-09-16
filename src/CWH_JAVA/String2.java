package CWH_JAVA;
import java.util.*;
public class String2 {
    public static void main(String[] args) {
        for(;;){
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        int value = str.length();
        System.out.println("Length is "+value);
        String lower = str.toLowerCase();
        String upper = str.toUpperCase();
        System.out.println("Lower is "+lower);
        System.out.println("Upper is "+upper);
        System.out.println(str.substring(4, 8));
        System.out.println("Substring "+str);
        System.out.println("Replace1 "+str.replace('r','i'));
        System.out.println("replace2 "+str.replace('i','r'));
        System.out.println("Replace3 "+str.replace("Sriyansu","CRBO"));
        boolean b = str.startsWith("s");
        System.out.println("Boolean starts with "+b);
        boolean c = str.endsWith("u");
        System.out.println("Boolean ends with "+c);
        System.out.println("char at "+str.charAt(6));
        String nstr = "Sriyansu";
        System.out.println(str.equals(nstr));
        System.out.println(str.indexOf("y"));
        System.out.println(str.lastIndexOf("y"));
        System.out.println(str.lastIndexOf("s",90));
        System.out.println(str.equalsIgnoreCase(""));
        System.out.println(str.indexOf("yan"));
        System.out.println("Hi i am Sriyansu Dash\f Who write the above code \t Ok\n Welcome \"  I am an Engineer \"");
        }
    }
}
