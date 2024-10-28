import java.util.*;
public class fiboIter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 45;
        int position = in.nextInt(); 
        int first = 0, second = 1;
        int fibo[] = new int[n] ;
        if(n>0){

            fibo[0] = 0;
        }
        if(n>1){

            fibo[1] = 1;
            System.out.println(fibo[0]+" "+fibo[1]+" ");
        }
        for (int i = 2 ;i<fibo.length;i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.println(fibo[i]+" ");
        }
        System.out.println(fibo[position]);
    }
}
