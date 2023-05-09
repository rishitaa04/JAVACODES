import java.util.*;

public class solidrect {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            // System.out.print("*");
            for (int j = 1; j <= 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
