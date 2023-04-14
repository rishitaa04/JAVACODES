import java.util.*;

public class takinginput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int a = sc.nextInt();
        System.out.print("Enter second integer : ");
        int b = sc.nextInt(); // ln line change krne k liye i.e. println
        System.out.print("Enter third integer : ");
        int c = sc.nextInt();

        int d = a + b + c;
        System.out.println("Total = " + d);
        sc.close();

    }
}
