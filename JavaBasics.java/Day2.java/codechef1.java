
// Write a program in the IDE which does the following
// Accepts the count of test cases -  t - in the 1st line The only line of each test case consists of an integer 
// You need to generate the following output - Change the sign of N. That is, if the input is 4, output −4. If the input is 5 and −5 is the output 
import java.util.*;

public class codechef1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of inputs : ");
        int n = sc.nextInt();
        // nextLine();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            System.out.print(0 - t);
        }
        sc.close();
    }
}
