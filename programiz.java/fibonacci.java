// package programiz.java;

import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fibonacci series : ");
        int n = sc.nextInt();
        int firstterm = 0;
        int secondterm = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstterm + " ");
            int nextTerm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextTerm;
        }

        sc.close();
    }
}
