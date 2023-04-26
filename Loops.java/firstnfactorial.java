import java.util.*;

public class firstnfactorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; ++i) {
            fact = fact * n;
        }
        System.out.print("The factorial of a numnber is : " + fact);
        sc.close();
    }
}
