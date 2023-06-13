
// package programiz.java;
import java.util.*;

public class additionof2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of two numbers is " + c);
        sc.close();

    }
}
