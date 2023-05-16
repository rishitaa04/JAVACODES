// package Strings.java;
// package Strings;

import java.util.*;

public class inputoutput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name;
        name = sc.nextLine();
        System.out.print("The name entered is : " + name);

        // .next se sirf ek single word leta hai
        // to uspe next k place pe nextLine ka use krenge
        sc.close();
    }
}
