// package methods.java;

import java.util.Scanner;

public class characteratgivenstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.charAt(5));
        sc.close();
    }
}
