
// package programiz.java;
import java.util.*;

public class floatmultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first floating value : ");
        float f1 = sc.nextFloat();
        System.out.print("Enter your second floating value : ");
        float f2 = sc.nextFloat();
        float f3 = f1 + f2;
        System.out.println("The sum of two floating value is : " + f3);
        float f4 = f3 * 2;
        System.out.println("when sum is multiplied by 2 , we get " + f4 + " as answer");
        sc.close();
    }
}
