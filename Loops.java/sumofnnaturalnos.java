// import java.util.*;

// public class sumofnnaturalnos {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num = 1;
//         int sum = 0;
//         while (num <= n) {
//             sum = sum + num;
//             num = num + 1;
//         }
//         System.out.print(" The sum is : " + sum);
//         sc.close();
//     }

// }
import java.util.*;

public class sumofnnaturalnos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + n;
        }
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
