// you need to write a program which does the following Accepts the number of inputs / test cases as t The only line of each test case contains 2 integers - declare them as variables A and B For each test case, you need to perform the following operations Create a variable - S - the sum of the 2 input integers Create a variable - P - the product of the 2 input integers Output 2 space separated integers -S and P in a single line

import java.util.*;

public class addmultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int A = sc.nextInt();
        System.out.print("Enter your second number : ");
        int B = sc.nextInt();
        int S = A + B;
        int P = A * B;
        System.out.println("The sum of your input numbers is : " + S);
        System.out.println("The product of your input numbers is : " + P);
        sc.close();
    }

}
