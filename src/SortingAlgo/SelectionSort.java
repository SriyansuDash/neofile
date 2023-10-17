package SortingAlgo;

public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,5,4,7,32,7,34,9,2,10,66};
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Selection Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


// package SortingAlgo;
// import java.util.*;
// public class SelectionSort{
//     public static void printDetails(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the Size of Array : ");
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of Array");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = in.nextInt();
//         }
//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     int temp = arr[smallest];
//                     arr[smallest] = arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         // System.out.println();
//         printDetails(arr);
        
//     }
// }