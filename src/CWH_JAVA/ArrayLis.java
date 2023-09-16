package CWH_JAVA;
import java.util.*;
public class ArrayLis{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(12);
        list.add(123);
        list.add(1234);
        list.add(1345);
        list.add(12356);
        list.add(1234567);
        list2.add(9);
        list2.add(89);
        list2.add(789);
        list2.add(6789);
        list2.add(56789);
        list2.add(456789);
      //  list.clear();
        list2.addAll(0, list);
    for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
        System.out.println(list2.contains(12));
    }
}

// package CWH_JAVA;
// import java.util.*;
// public class ArrayLis{
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         ArrayList<Integer> lis = new ArrayList<>();
//         lis.add(44);
//         System.out.println(lis.get(0));
//     }
// }


// import java.util.*;
// public class ArrayLis{
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list.add(12);
//         list.add(123);
//         list.add(1234);
//         list.add(1345);
//         list.add(12356);
//         list.add(1234567);
//         list2.add(9);
//         list2.add(89);
//         list2.add(789);
//         list2.add(6789);
//         list2.add(56789);
//         list2.add(456789);
//       //  list.clear();
//         list2.addAll(0, list);
//     for(int i=0;i<list2.size();i++){
//             System.out.println(list2.get(i));
//         }
//         System.out.println(list2.contains(12));
//     }
// }

// package CWH_JAVA;
// import java.util.*;
// public class ArrayLis{
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         ArrayList<Integer> lis = new ArrayList<>();
//         lis.add(44);
//         System.out.println(lis.get(0));
//     }
// }
