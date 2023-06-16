// package AC4.0.java.conditionalstatement.java.if-else.java;

import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 12;
        int b = 4;
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                // int a/b;
                System.out.println(a + b);
                break;
            case '-':
                // int a/b;
                System.out.println(a - b);
                break;
            case '/':
                // int a/b;
                System.out.println(a / b);
                break;
            case '*':
                // int a/b;
                System.out.println(a * b);
                break;
            case '%':
                // int a/b;
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enter toh kro");
        }
        sc.close();
    }
    // sc.clos

}
