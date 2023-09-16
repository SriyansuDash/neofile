package CWH_JAVA;
import java.util.*;
public class Continue {
    public static void main(String[] args){
        for(int i=0;i<50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("loop is ended");
        }
    }
 }

// package CWH_JAVA;
// import java.util.*;
// public class Continue{
//     public static void main(String...args){
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = in.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 System.out.println(i);
//                 continue;
//             }
//         }
//     }
// }