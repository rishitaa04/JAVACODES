// package AC4.0.java.Patternadvance.java;

import java.util.Scanner;

public class Floydstriangle {
    public static void Floyd(int rows) {
        int counter = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; i <= i; j++) {
                System.out.print(counter++ + " ");
                // counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        Floyd(rows);
        sc.close();
    }
}
