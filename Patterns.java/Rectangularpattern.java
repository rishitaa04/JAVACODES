
// ****
// ****
// ****
// ****
import java.util.*;

public class Rectangularpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.print("*");
        sc.close();
    }

    // for(int i = 1 ; i <=4 ; i++){
    // for(int j = 1 ; j <=3 ; j++){
    // System.out.println("*");
    // }
    // }
}
