import java.util.*;

public class divisibilitycheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
