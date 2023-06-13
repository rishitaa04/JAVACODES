
// package programiz.java;
import java.util.*;

public class reverseanumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int reverse = 0 ;
        while (n != 0) {
            int rem = n % 10;
            int reverse = 0;
            reverse = reverse * 10 + rem;
            n /= 10;
            System.out.print(reverse);
        }
        // System.out.println(n);
        sc.close();
    }
}
