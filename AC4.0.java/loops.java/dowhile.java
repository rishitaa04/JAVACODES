// package AC4.0.java.loops.java;

// import java.lang.constant.DynamicConstantDesc;
import java.util.Scanner;

public class dowhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0)
                break;
            System.out.println(n);
        } while (true);
        // System.out.println(n);

        sc.close();
    }
}
