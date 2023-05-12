
// package JavaBasics.java.day8.java;
import java.util.*;

public class decimaltobinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your decimal number : ");
        int decimal = sc.nextInt();
        int binary = 0;
        int power = 1;
        while (decimal > 0) {
            int parity = decimal % 2;
            binary += (parity * power);
            power *= 10;
            decimal /= 2;
        }
        System.out.print(binary);
        sc.close();
    }
}
