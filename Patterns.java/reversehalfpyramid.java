
// package Patterns.java;
import java.util.*;

public class reversehalfpyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        for (int j = 1; j <= r; j++) {
            for (int i = 1; i <= r - j; i++) {
                System.out.print(" ");
            }
            // System.err.println
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
