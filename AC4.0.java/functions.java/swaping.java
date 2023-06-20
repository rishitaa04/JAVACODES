// package AC4.0.java.functions.java;

import java.util.Scanner;

public class swaping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        // System.out.print("Your first number before swaping is : " + a);
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Your first number before swaping is : " + a);
        System.out.println("Your second number before swapping is : " + b);

        int temp = a;
        a = b;
        b = temp;
        sc.close();

        System.out.println(" Your first number after swaping is : " + a);
        System.out.println("Your second number after swaping is :" + b);
    }
}
