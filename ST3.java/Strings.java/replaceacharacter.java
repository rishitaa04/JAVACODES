// package ST3.java.Strings.java;

import java.util.Scanner;

public class replaceacharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Str = str.replaceAll("a", "");
        System.out.println(Str);
        sc.close();
    }
}
