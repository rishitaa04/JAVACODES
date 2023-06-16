// package AC4.0.java.patterns.java;

import java.util.Scanner;

public class lefttrianglestar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
