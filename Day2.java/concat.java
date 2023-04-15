// You need to perform the following operation
// Create a variable X which contains the string S concatenated with the string S Output X for each test case

import java.util.*;

public class concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s = sc.next();
        String X = s + s;
        System.out.print("Your updated string is : " + X);
        sc.close();
    }
}