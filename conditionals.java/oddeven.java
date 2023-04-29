
import java.util.*;

public class oddeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.print("It's even");
        } else if (n % 2 != 0) {
            System.out.print("It's odd");
        }
        sc.close();
    }
}
