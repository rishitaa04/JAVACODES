// package methods.java;

import java.util.Scanner;

public class substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.substring(0, 4);
        System.out.println(str1);
        sc.close();
    }
}
