import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n) {
        int[] fibs = new int[n];
        fibs[0] = 0;
        fibs[1] = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        for (int i = 0; i < n; i++) {
            sum += fibs[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numBalloons = s.nextInt();
        int result = fibo(numBalloons);
        System.out.println(result);
        s.close();
    }
    // s.close();

}
