// package AC4.0.java.functions.java;

import java.util.Scanner;

public class decimaltobinary {
    public static void decitobin(int decimal) {
        int power = 0;
        int binary = 0;
        int mynum = decimal;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + (remainder * (int) Math.pow(10, power));
            power++;
            decimal = decimal / 2;
        }
        System.out.println("Binary form of " + mynum + " is " + binary);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        decitobin(decimal);
        sc.close();

    }
}
