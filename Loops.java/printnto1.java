import java.util.*;

public class printnto1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            System.out.println(num);
        }
        sc.close();
    }
}
