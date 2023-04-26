import java.util.*;

public class countthedigitofnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int numofdigit = 0;
        while (n > 0) {
            n = n / 10;
            numofdigit++;
        }
        System.out.print("The number of digits in " + original + " is " + numofdigit);
        sc.close();
    }
}
