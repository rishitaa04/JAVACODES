
// package programiz.java;
import java.util.*;

public class swappingtwonumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();

        System.out.println("Numbers before swapping is : " + a + " and " + b);
        System.out.println("Numbers after swapping be : ");
        int temp = a;
        a = b;
        b = temp;
        // System.out.println("Now a");
        System.out.println("first number is : " + a);
        System.out.println("second number is " + b);
        sc.close();
    }
}
