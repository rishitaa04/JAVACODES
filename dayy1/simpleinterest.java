import java.util.*;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        int p = sc.nextInt();
        System.out.print("Enter ROI : ");
        int r = sc.nextInt();
        System.out.print("Enter Time : ");
        int t = sc.nextInt();
        int d = (p * r * t) / 100;
        System.out.println("The simple interest is : " + d);
        sc.close();
    }
}
