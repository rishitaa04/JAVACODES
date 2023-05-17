// Write a Java program to remove all whitespace from a string.

import java.util.*;

public class removeallwhitespace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        // int arr[] = new int[250];
        String str = Str.replaceAll("\\s", "");
        System.out.println(str);
        sc.close();
    }

}
