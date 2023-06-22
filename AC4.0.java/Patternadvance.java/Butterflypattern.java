// package AC4.0.java.Patternadvance.java;

import java.util.Scanner;

public class Butterflypattern {

    public static void butterfly(int n) {

        // First half

        // n tkk loop chlega

        // outer loop yaani number of stars
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // inner loop
            // number of spaces to be printed
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // again number of stars to be printed
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // inner loop
            // number of spaces to be printed
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // again number of stars to be printed
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        butterfly(n);
        sc.close();
    }
}
