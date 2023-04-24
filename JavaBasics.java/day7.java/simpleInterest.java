import java.util.*;

public class simpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        int p = sc.nextInt();
        System.out.print("Enter rate of Interest : ");
        int r = sc.nextInt();
        System.out.print("Enter time : ");
        int t = sc.nextInt();

        int si = (p * r * t);
        int simpleinterest = si / 100;
        System.out.print("Simple interest calculated is : " + simpleinterest);
        sc.close();
    }
}
