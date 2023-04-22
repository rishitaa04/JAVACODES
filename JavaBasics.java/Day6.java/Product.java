
import java.util.*;

public class Product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int a = sc.nextInt();
        System.out.print("Enter your value : ");
        int b = sc.nextInt();
        int c = a * b;
        System.out.print("The product is : " + c);
        sc.close();
    }
}
