// package methods.java;

import java.util.Scanner;

public class comparision {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Str = sc.nextLine();
        System.out.println(str.compareTo(Str));
        sc.close();
    }
}
