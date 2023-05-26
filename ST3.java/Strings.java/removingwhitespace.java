// package ST3.java.Strings.java;

// import java.io.StreamCorruptedException;
import java.util.*;

public class removingwhitespace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.replaceAll("\\s", "");
        System.out.println(str1);
        sc.close();
    }
}
