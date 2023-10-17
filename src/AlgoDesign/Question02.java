package AlgoDesign;
import java.util.*;
public class Question02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the size of Array : ");
        int n = in.nextInt();
        int arr[] = new int[n];
        //input
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        // finding max
        int max = 0;
        
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            else{
                continue;
            }
        }
        //Finding min
        int min = max;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
    }
}
