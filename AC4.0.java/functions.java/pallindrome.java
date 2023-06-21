// package AC4.0.java.functions.java;

import java.util.Scanner;

public class pallindrome {

    public static boolean isPallindrome(int number) {
        int pallindrome = number;
        boolean flag = false;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10; // hme last element mili
            reverse = reverse * 10 + remainder; // abi reverse me number stored hua last and reverse ki value update
                                                // huyi
            number = number / 10;
        }
        if (pallindrome == reverse) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPallindrome(number));
        // also
        if (isPallindrome(number)) {
            System.out.println("A pallindrome number");
        } else {
            System.out.println("Not a pallindrome number");
        }
        sc.close();
    }
}
