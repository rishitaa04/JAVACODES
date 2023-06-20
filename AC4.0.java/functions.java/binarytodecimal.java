// package AC4.0.java.functions.java;

import java.util.*;

public class binarytodecimal {

    public static void bintodec(int binarynumber) {
        int power = 0;
        int decimalnumber = 0;

        while (binarynumber > 0) {
            int last_digit = binarynumber % 10;
            decimalnumber = decimalnumber + (last_digit * (int) Math.pow(2, power));

            power++;
            binarynumber /= 10;

        }
        System.out.println(" the decimal value of binarynumber " + " is " + decimalnumber);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binarynumber = sc.nextInt();

        // System.out.println(" the decimal value of " + binarynumber + " is " +
        // decimalnumber);
        bintodec(binarynumber);
        sc.close();
    }
}
