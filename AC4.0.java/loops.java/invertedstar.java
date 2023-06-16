// package AC4.0.java.loops.java;

import java.util.Scanner;

public class invertedstar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 4; line >= n; line++) {
            for (int star = 1; star <= n; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
