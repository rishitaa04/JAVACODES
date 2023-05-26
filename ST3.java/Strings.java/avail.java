// // package ST3.java.Strings.java;

// import java.util.Scanner;

import java.util.Scanner;

public class avail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 's') {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("not present");
        } else {
            System.out.println("present");
        }
        sc.close();
    }

}
