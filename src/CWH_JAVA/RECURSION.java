// package CWH_JAVA;
// import java.util.*;
// public class RECURSION {
//     static void factorial(int n){
//         // if(n==1){
//         //     return 1;
//         // }
//         // return n*factorial(n-1);
        
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         factorial(n-1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         int a = in.nextInt();
//         //System.out.println(factorial(a));
//         factorial(a);
//     }
// }

package CWH_JAVA;
import java.util.*;
public class RECURSION{
   static int recur(int n){
    if (n==0||n==1){
        return 1;
    }
    else{
        return n*recur(n-1);
    }
   }
   public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    System.out.println(recur(n));
   }
}


