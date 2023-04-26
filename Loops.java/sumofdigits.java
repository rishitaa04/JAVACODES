import java.util.*;

public class sumofdigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The number you entered is : " + n);
        int sum = 0;
        while (n > 0) {

            sum += n % 10;
            n = n / 10;
        }
        System.out.print(" The sum is : " + sum);
        sc.close();
    }
}
