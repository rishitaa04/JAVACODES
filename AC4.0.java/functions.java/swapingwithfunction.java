// package AC4.0.java.functions.java;

import java.util.Scanner;

public class swapingwithfunction {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping the numbers are : ");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Numbers before swapping is : ");
        System.out.println(a);
        System.out.println(b);

        swap(a, b);
        sc.close();
    }
}
