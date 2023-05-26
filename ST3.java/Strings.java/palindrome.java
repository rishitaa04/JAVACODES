// package ST3.java.Strings.java;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - i - 1)) {
                System.out.println("Pallindrome");
                break;
            } else {
                System.out.println("not pallindrome");
                // break;
            }
        }
        sc.close();
    }

}
