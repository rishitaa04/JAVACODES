import java.util.*;

public class intro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
        // System.out.println( i + j );
        sc.close();
    }
}
