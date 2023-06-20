// package AC4.0.java.functions.java;

import java.util.Scanner;

public class sum {
    public static void calcsum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is : " + sum);
        sc.close();
    }

    public static void main(String args[]) {
        calcsum(); // calling the function
    }
}
