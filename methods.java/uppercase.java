// package methods.java;

import java.util.Scanner;

public class uppercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.toUpperCase());
        sc.close();
    }
}
