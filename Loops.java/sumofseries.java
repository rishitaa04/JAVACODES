import java.util.*;
// S = 1-2+3-4

public class sumofseries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans = ans - i;
            } else {
                ans = ans + i;
            }
        }
        System.out.print("The sum of series is : " + ans);
        sc.close();
    }

}
