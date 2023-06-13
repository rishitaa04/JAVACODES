
// package programiz.java;
import java.util.*;

public class vowelorconsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // char abc = sc.nextLine();
        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
        sc.close();
    }
}
