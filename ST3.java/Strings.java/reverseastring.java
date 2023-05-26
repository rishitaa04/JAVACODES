
// package ST3.java.Strings.java;
import java.util.*;

public class reverseastring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();
        String str1 = " ";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str1 = ch + str1;
        }
        System.out.println("Reversed string is : " + str1);
        sc.close();
    }
}
