// package AC4.0.java.functions.java;

// only for >= 2
import java.util.Scanner;

public class primarycheck {
    public static boolean isprime(int n) {
        // boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                // isprime = false;
                return false;
                // break;
            }
        }
        // return isprime;
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
}
