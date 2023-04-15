
// You will attend tuitions for X weeks, and the cost of tuition per week is Y dollars.You need to compute and output your total tuition fees.
import java.util.*;

public class tuitionfees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fees : ");
        int X = sc.nextInt();
        System.out.print("Enter the number of weeks you attended : ");
        int Y = sc.nextInt();
        int Z = X * Y;
        System.out.println("Total fees per week is : " + Z);
        sc.close();
    }
}
