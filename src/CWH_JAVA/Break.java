package CWH_JAVA;
// import java.lang.constant.DynamicConstantDesc;
import java.util.*;
public class Break{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        // Scanner in = new Scanner (System.in);
        // System.out.println("Enter the limit ");
        // int n = in.nextInt();
        // for(int i=0;i<=50;i++){
        //     System.out.println(i);
        //     System.out.println("Java is great ");
        //     if(i==n){
        //         System.out.println("Ending the loop ");
        //         break;
        //     }
        // }
        // System.out.println("Loop is ended ");

        // // For loop : 
        for(int i=0;i<=Integer.MAX_VALUE;i++){
            System.out.println(i);
            if(i==n){
                break;
            }
        }
        System.out.println("Loop is ended");

        // while loop : 
        int j=1;
        while(j<=Integer.MAX_VALUE){
            System.out.println(j);
            if(j==n){
            break;
            }
            j++;
        }
        System.out.println("Loop has been ended ");

        // do while

         int k=0;
        do{
            System.out.println(k);
            if(k==n)
            break;
            k++;
        }while(k<=Integer.MAX_VALUE);
    }
}
