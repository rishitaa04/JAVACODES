// package AC4.0.java.patterns.java;

import java.util.Scanner;

public class halfpyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
        sc.close();
    }
}
