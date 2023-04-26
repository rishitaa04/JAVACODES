import java.util.Scanner;

public class Reversethedigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int temp = n % 10;
            reverse = reverse * 10
                    + temp;
            n = n / 10;
        }
        System.out.print("The reverse of " + original + " is " + reverse);
        sc.close();
    }
}
