package AlgoDesign;
import java.util.*;
public class Question05 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter 1st number : ");
        int a = in.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = in.nextInt();
        int temp =0;
        while(a%b!=0){
            temp = a%b;
            a=b;
            b= temp;
        }
        System.out.println(b);
    }
}
