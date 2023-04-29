import java.util.*;

public class percentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage : ");
        int marks = sc.nextInt();
        if (marks > 90 && marks <= 100) {
            System.out.print("Excellent");
        } else if (marks >= 80 && marks <= 90) {
            System.out.print("Very goood");
        } else if (marks >= 70 && marks < 80) {
            System.out.print("Good");
        } else if (marks >= 60 && marks < 70) {
            System.out.print("Can do better");
        } else if (marks >= 50 && marks < 60) {
            System.out.print("Average");
        } else if (marks >= 40 && marks < 50) {
            System.out.print("Below average");
        } else if (marks < 40) {
            System.out.print("Fail");
        }
        sc.close();
    }
}
