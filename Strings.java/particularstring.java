// package Rishiksir.java.Strings.java;
// 1. Write a Java program to check if a string contains a particular character.

import java.util.Scanner;

public class particularstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                System.out.print("Not present");
            } else {
                System.out.println("Present");
            }
        }

        sc.close();
    }

}
