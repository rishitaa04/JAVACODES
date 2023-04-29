import java.util.*;

public class digitcheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your digit : ");
        int digit = sc.nextInt();
        if (digit > 99 && digit < 1000) {
            System.out.print("It's a three digit number ");
        } else {
            System.out.print("Not a three digit number ");
        }
        sc.close();
    }
}