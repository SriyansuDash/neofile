import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 14;
        System.out.println("Enter the nth position : ");
        int position = sc.nextInt();
        System.out.println("The " + position + "th Fibonacci number is: " + fibonacci(position));
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];

    }
}
