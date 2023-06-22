// package AC4.0.java.Patternadvance.java;

import java.util.Scanner;

public class invertedandrotatedpyramid {

    public static void IRpyramid(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        // System.out.println();
        IRpyramid(rows, columns);
        sc.close();
    }
}
