import java.util.*;

public class Areaofcircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float radius = sc.nextFloat();
        float area = 2 * 22 / 7 * radius * radius;
        System.out.print("Area of circle is : " + area);
        sc.close();
    }
}
