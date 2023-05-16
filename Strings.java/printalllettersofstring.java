
// package Strings.java;
import java.util.*;

public class printalllettersofstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i <= name.length(); i++) {
            // if (name.charAt(i) == 'a') {
            // System.out.println(i);
            // }
            System.out.println(name.charAt(i));
            // if (name.charAt(i) == 'a') {
            // System.out.println(i);
            // }
        }
        sc.close();
    }
}
