package SortingAlgo;

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current >arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}


// package SortingAlgo;
// import java.util.*;
// public class InsertionSort{
//     public static void printArray(int arr[] ){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the size of Array : ");
//         int n = Integer.parseInt(in.next());
//         int arr[] = new int[n];
//         System.out.println("Enter the element of Array : ");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = in.nextInt();
//         }
//         System.out.println("After Insertion sort : ");
//         for(int i=0;i<arr.length;i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current<arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             } 
//             arr[j+1] = current;
//         }
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         // System.out.println();
//         printArray(arr);
//     }
// }
