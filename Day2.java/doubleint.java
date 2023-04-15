// You are given a program which does the following Accepts the count of test cases -t - in the 1st line The only line of each test case consists of an integer N For each test case, output to the console the value that is double the integer N

import java.util.*;

public class doubleint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int t = n * 2;
        System.out.println("Your number after double is : " + t);
        sc.close();
    }
}
