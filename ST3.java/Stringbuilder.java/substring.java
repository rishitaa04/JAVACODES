// package ST3.java.Stringbuilder.java;
//given a string......print all the substrings of s 

import java.util.Scanner;

public class substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder("Hey");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.println(str.substring(i, j) + "");
            }
        }
        sc.close();
    }

}
