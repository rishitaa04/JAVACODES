
// package Strings.java;
// pallindrome means aage piche dono se ek hi word smjh aye jese eye , noon , madam , etc.......

import java.util.*;

public class Ispalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("false");
            } else {
                System.out.println("True");
            }
        }
        sc.close();

    }

}
