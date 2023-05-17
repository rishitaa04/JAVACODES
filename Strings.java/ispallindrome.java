// package Rishiksir.java.Strings.java;

import java.util.Scanner;

public class ispallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Notpallindrome");
                break;
            } else {
                System.out.println("Pallindrome");
                // break;
            }
        }
        sc.close();
    }
}
