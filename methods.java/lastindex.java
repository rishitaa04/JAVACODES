// package methods.java;

import java.util.Scanner;

public class lastindex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        System.out.println(str.lastIndexOf(s));
        sc.close();
    }
}
