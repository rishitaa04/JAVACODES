
// package programiz.java;
import java.util.*;

public class leapyear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year : ");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("leap year");
        }
        sc.close();
    }
}
