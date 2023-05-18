// package methods.java;

import java.util.Scanner;

// import javax.sql.rowset.spi.SyncResolver;

public class equal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = new String("java");
        System.out.println(str.equals(str1)); // ye true dega
        System.out.println(str == str2); // ye false dega

        sc.close();
    }
}
