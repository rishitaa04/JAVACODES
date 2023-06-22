// package AC4.0.java.Patternadvance.java;

import java.util.Scanner;

public class iandrwithnumber {
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberPyramid(n);
        sc.close();
    }
}
