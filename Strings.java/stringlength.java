// package Strings.java;

import java.util.Scanner;

public class stringlength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.print(name.length());
        sc.close();
    }
}
// length k liye we use .length function