package CWH_JAVA;
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         String s1 = "sriyansu";
//         String s2 = "dash";
//         //concatination
//         String concatination = s1+s2+"@outlook.com";
//         //.length()
//         System.out.println("Concated string is "+concatination.length());
//         System.out.print(s1+" "+s2);
//         //charAt
//         for(int i=0;i<concatination.length();i++){
//            System.out.println(concatination.charAt(i));
//            //System.out.println(concatination.charAt(6));
//         }
//         System.out.println("CharAt word is "+concatination.charAt(15));
//         //comparision of strings

        // if(s1.compareTo(s2)==0){
        //    if(new String("Dash")==new String("Dash")){
        //     System.out.println("Strings are equal");
        // }
//         else{
//             System.out.println("Strings are not equal");
//         }
//         //substring
//         String sentence = "Hi I am Sriyansu Dash ";
//         String substr = sentence.substring(2,sentence.length());
//         String substr1 = sentence.substring(2,7);
//         System.out.println(substr1);
//         System.out.println(substr);

//     }
// }


import java.util.*;
public class Strings{
    public static void main(String[] args) {
    String s1 = "Sriyansu";
    String s2 = "Dash";
    System.out.println(s1+" "+s2);  
    //concationation 
    String concation = s1+s2;
    System.out.println("Concatination "+concation.length()); 
    // charAt
    System.out.println("charAt "+concation.charAt(4));  
    // for(int i=0;i<concation.length();i++){
    //     System.out.print(concation.charAt(i)+" ");
    //     System.out.println();
    //     System.out.println(concation.charAt(5));
    //     }
        if(s1.compareTo(s2)==0){
            if(new String("Dash")==new String("Dash")){
            System.out.println("Strings are equal");
            }
        }
        else{
            System.out.println("False");
        }
      
    }
}