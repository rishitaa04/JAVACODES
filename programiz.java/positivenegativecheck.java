
// package programiz.java;
import java.util.*;

public class positivenegativecheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("positive number ");
        } else if (a < 0) {
            System.out.println("negative number ");
        } else {
            System.out.println("it's a zero");
        }
        sc.close();
    }
}
