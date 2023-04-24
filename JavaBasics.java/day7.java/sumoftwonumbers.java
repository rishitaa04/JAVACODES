import java.util.*;

public class sumoftwonumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int x = sc.nextInt();
        System.out.print("Enter your second number : ");
        int y = sc.nextInt();
        int z = x + y;
        System.out.print("The sum is : " + z);
        sc.close();
    }
}
