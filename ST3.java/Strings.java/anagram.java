// package ST3.java.Strings.java;

import java.util.Scanner;

public class anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        // int arr[] = new int[250];
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str.charAt(i) != str1.charAt(j)) {
                    flag = false;
                    // System.out.println("Not an anagram");
                    // break;
                }
            }
        }
        if (flag == true) {
            System.out.println("Anagram");
        } else {
            System.out.println("not anagram");
        }
        sc.close();
    }
}
