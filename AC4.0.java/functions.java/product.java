// package AC4.0.java.functions.java;

import java.util.Scanner;

public class product {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println("prodduct is : " + prod);
        sc.close();
    }
}
