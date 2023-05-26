// package AC4.0.java.loops.java;

import java.util.Scanner;

public class oddsumevensum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0) {
                evensum += n;
                // System.out.print(evensum);
            } else {
                oddsum += n;
                // System.out.print(oddsum);
            }

        }
        System.out.println(evensum);
        System.out.println(oddsum);
        sc.close();
    }
}
// importjava.util.Scanner;publicclassSolution{publicstaticvoidmain(String[]args)
// {Scannersc=newScanner(System.in);intnumber;intchoice;intevenSum=0;intoddSum=0;do{System.out.print("Enter
// the number ");number=sc.nextInt();if(number%2==0)
// {evenSum+=number;}else{oddSum+=number;}System.out.print("Doyouwanttocontinue?Press1foryesor0forno");choice=sc.nextInt();}while(choice==1);System.out.println("Sum
// of even numbers: "+evenSum);System.out.println("Sum of odd numbers:
// "+oddSum);}}rishitasinha4@gmail.com

// import java.util.*;

// import java.util.Scanner;

// public class oddsumevensum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;
// do {
// System.out.print("Enter the number ");
// number = sc.nextInt();
// if (number % 2 == 0) {
// evenSum += number;
// } else {
// oddSum += number;
// }
// System.out.print("Do you want to continue ? Press 1 for yes or 0 for no ");
// choice = sc.nextInt();
// } while (choice == 1);
// System.out.println("Sum of even numbers : " + evenSum);
// System.out.println("Sum of odd numbers : " + oddSum);
// sc.close();
// }
// }
