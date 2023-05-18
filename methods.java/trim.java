// package methods.java;

import java.util.Scanner;

public class trim {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.trim()); // remove aage and piche k 3 spaces
        sc.close();
    }
}
