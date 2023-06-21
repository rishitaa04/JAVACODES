// package AC4.0.java.functions.java;

import java.util.Scanner;

public class sumofdigitsinanumber {

    public static int SumofDigit(int number) {
        int sum = 0;
        while (number != 0) {
            int last_digit = number % 10;
            sum += last_digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        System.out.println("The sum of digits of given number is : " + SumofDigit(number));
        sc.close();
    }
}
