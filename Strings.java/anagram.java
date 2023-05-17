// package Rishiksir.java.Strings.java;

import java.util.Scanner;

public class anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int arr[] = new int[250];
        for (int i = 0; i < str.length(); i++) {
            arr[(int) str.charAt(i)] += 1;
        }
        for (int j = 0; j < str1.length(); j++) {
            arr[(int) str1.charAt(j)] -= 1;
        }
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
        sc.close();
    }
}

// import java.util.*;
// public class String1_6 {
// public static void main(String args[]) {
// Scanner sc=new Scanner(System.in);
// String str1=sc.nextLine();
// String str2=sc.nextLine();
// int arr[] = new int[256];
// for(int i = 0; i < str1.length(); i++) {
// arr[(int)str1.charAt(i)] += 1;
// }
// for(int i = 0; i < str1.length(); i++) {
// arr[(int)str2.charAt(i)] -= 1;
// }
// boolean check = true;
// for(int i = 0; i < str1.length(); i++) {
// if(arr[i] != 0) {
// check = false;
// break;
// }
// }
// if(check)
// System.out.println("It is a Anagram");
// else
// System.out.println("Not Anagram");
// }
// }