package CWH_JAVA;
import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Sriyansu");
    System.out.println(sb);
    //charAt
        System.out.println(sb.charAt(3));
    //INSERT
    sb.insert(0, "Dash ");
    System.out.println(sb);

    //delete
    sb.delete(0,5);
    System.out.println(sb);

//     StringBuilder sb = new StringBuilder("Visual Studio");
//     System.out.println(sb);

// // instrt
// sb.insert(13, " A Microsoft Product ");
// System.out.println(sb);
// //delete 
// sb.delete(13,sb.length()); 
// System.out.println(sb);
// ///charAt
// System.out.println("CharAt is "+sb.charAt(7));


//append
StringBuilder str = new StringBuilder("S");
str.append("r");
str.append("i");
str.append("y");
str.append("n");
str.append("s");
str.append("u");
System.out.println("Append "+sb);
System.out.println(str.length()); 
    }
}
