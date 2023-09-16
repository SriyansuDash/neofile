package SortingAlgo;
public class BubbleSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {43,76,213,744,234,345546,0,131,1324,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j = 0 ;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort : ");
        // for(int i=0;i<arr.length-1;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        printArray(arr);
    }
}


// package SortingAlgos;
// import java.util.*;
// public class BubbleSort{
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the size of Array : ");
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of Array : ");
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         System.out.println("After Bubble Sort : ");
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         // System.out.println();
//         printArray(arr);
//     }
// }