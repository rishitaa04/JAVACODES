// package AC4.0.java.loops.java;

import java.util.Scanner;

public class reversethegivennumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        while (number > 0) {
            int last = number % 10;
            reverse = (reverse * 10) + last;
            number = number / 10;
        }
        System.out.print(reverse);
        sc.close();
    }
}
