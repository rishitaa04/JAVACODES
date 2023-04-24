import java.util.*;

// import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class areaofcircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.print("The area of circle is : " + area);
        sc.close();
    }
}
