package AlgoDesign;
import java.util.*;
public class Question01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int arr[] = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}
