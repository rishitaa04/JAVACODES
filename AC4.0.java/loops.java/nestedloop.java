// package AC4.0.java.loops.java;

import java.util.Scanner;

public class nestedloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
