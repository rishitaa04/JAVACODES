import java.util.*;

public class perimeterarea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = sc.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if (area > perimeter) {
            System.out.print("Area is greater than perimeter");
        } else if (perimeter > area) {
            System.out.print("Perimeter is greater than area");
        }
        sc.close();
    }
}
