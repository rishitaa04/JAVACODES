// package methods.java;

import java.util.Scanner;

public class replace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(str.replaceAll("A", ""));
        sc.close();
    }
}
