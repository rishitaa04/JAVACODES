// package AC4.0.java.Patternadvance.java;

// only to print border of the shape

import java.util.Scanner;

public class Hollowrectangle {

    public static void hollow_rectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        hollow_rectangle(rows, columns);
        sc.close();
    }
}
