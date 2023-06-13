
// package programiz.java;
import java.util.*;

public class multiplicationtable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no jiska multiple chahiye
        int i = 1;
        while (i <= 10) {
            int ans = 1;
            ans = n * i;
            System.out.println(n + "*" + i + " = " + ans);
            i++;
        }
        // System.out.println( n + "*" + i + " = " + ans);
        sc.close();
    }
}
