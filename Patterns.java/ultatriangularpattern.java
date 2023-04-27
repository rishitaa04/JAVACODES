// ****
// ***
// **
// *

import java.util.*;

public class ultatriangularpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        // for (int i = r; i >= 1; i--) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print("*");
        // }
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= c - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // System.out.print();
        sc.close();
    }
    // System.out.print(" ");

}
