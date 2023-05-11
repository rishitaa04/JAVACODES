
// package JavaBasics.java.day8.java;
import java.util.*;

public class binarytodecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number : ");
        int binary = sc.nextInt();
        int decimal = 0;
        int power = 1;

        while (binary > 0) {
            int ans = binary % 10;
            decimal += ans * power;
            binary /= 10;
            power *= 2;
        }
        System.out.print(decimal);
        sc.close();
    }
}
