
// package programiz.java;
import java.util.*;

public class largestamong3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first number : ");
        int a = sc.nextInt();
        System.out.print("enter your second number : ");
        int b = sc.nextInt();
        System.out.print("enter your third number : ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("greatest is a ");
        } else if (b > a && b > c) {
            System.out.print("greatest is b ");
        } else {
            System.out.print("c is greater");
        }
        sc.close();
    }
}
