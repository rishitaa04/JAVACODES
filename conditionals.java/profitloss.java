import java.util.*;

public class profitloss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.print("Profit");
        } else if (cp > sp) {
            System.out.print("Loss");
        }
        sc.close();
    }
}
