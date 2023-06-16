// package AC4.0.java.patterns.java;

import java.util.Scanner;

public class rihghttrianglestar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
