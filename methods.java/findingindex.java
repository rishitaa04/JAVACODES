// package methods.java;

import java.util.Scanner;

public class findingindex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = sc.nextLine();
        System.out.println(str.indexOf(a));
        sc.close();
    }
}
