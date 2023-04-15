import java.util.Scanner;

// Chef wants to become fit for which he decided to walk to the office and return home by walking.
// It is known that Chef's office is X km away from his home. If his office is open on 5 days in a week, find the number of kilometres Chef travels through office trips in a week.
public class Fitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance from the office : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of days he goes to the office : ");
        int a = sc.nextInt();
        int z = 2 * n * a;
        System.out.println("Total no of km he travels per week is : " + z);
        sc.close();
    }
}
