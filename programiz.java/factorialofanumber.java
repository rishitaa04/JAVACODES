
// package programiz.java;
import java.util.*;

public class factorialofanumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // sc.close();
        int fact = 1;
        int i = 1;
        int n = sc.nextInt();
        sc.close();
        while (i <= n) {
            fact = fact * i;
            i++;
            // System.out.println(fact);

        }
        System.out.println(fact);
        
        // 
       // sc.close
    }
}
