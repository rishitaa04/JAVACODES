import java.util.*;

public class firstnonrepeated {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int c = 0;
        int f = 0;
        for (int i = 0; i < n.length(); i++) {
            c = 0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(i) == n.charAt(j))
                    c++;

            }
            if (c == 1) {
                System.out.print(n.charAt(i));
                f++;
                break;
            }
        }
        if (f == 0)
            System.out.print(n.charAt(0));
        sc.close();
    }
    // sc.close();

}