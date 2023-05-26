// package AC4.0.java.loops.java;

import java.util.Scanner;

public class primeornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // boolean isprime = true;
        // for (int i = 2; i < n - 1; i++) {
        // if (n % i == 0)
        // isprime = false;
        // }
        if (n == 2) {
            System.out.println("is prime");
        } else {
            boolean isprime = true;
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0)
                    isprime = false;
                if (isprime == true)

                {
                    System.out.println("n is prime");
                    break;
                } else {
                    System.out.println("not prime");
                    // break;
                }
            }
        }
        sc.close();
        // if (isprime == true)

        // {
        // System.out.println("n is prime");
        // } else {
        // System.out.println("not prime");
        // }
    }
}
