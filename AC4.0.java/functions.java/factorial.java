// package AC4.0.java.functions.java;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int factorialvalue = fact(n);
        // System.out.println("Factorial value is : " + factorialvalue);
        System.out.println(fact(n));
        sc.close();
    }

}
