import java.util.Scanner;

public class indexofparticularstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.println(i);
            }
        }
        sc.close();
    }
}