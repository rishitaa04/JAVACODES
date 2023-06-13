// package programiz.java;

import java.util.Scanner;

public class power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        System.out.print("Enter your power number : ");
        int power = sc.nextInt();
        int result = 1;
        while (power != 0) {
            result = result * number;
            --power;
        }
        System.out.println("The answer is : " + result);
        sc.close();
    }
}
