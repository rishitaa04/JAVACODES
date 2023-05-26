// package ST3.java.Strings.java;

import java.util.Scanner;

public class removeallvowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String str = sc.nextLine();
        // String str1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                continue;
                // str1 = str.replaceAll(str, str1)
            } else {
                System.out.print(str.charAt(i));
            }

        }
        sc.close();
    }
    // sc.close();
}
