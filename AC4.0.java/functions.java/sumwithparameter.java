// package AC4.0.java.functions.java;

import java.util.Scanner;

public class sumwithparameter {
    public static int calcsum(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // qki function type int hai toh isliye value return krana hota hai
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        int sum = calcsum(a, b); // with this, we can store the value of sum in any of the variable
        System.out.println("The sum is : " + sum);
        sc.close();
    }
}
