// package AC4.0.java.loops.java;

import java.util.Scanner;

public class reverseofanumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int last = n % 10;
        while (n > 0) {
            int last = n % 10;
            System.out.print(last);
            n = n / 10;
        }
        sc.close();
    }
}
