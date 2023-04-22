import java.util.Scanner;

class areaofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = sc.nextInt();
        System.out.print("Enter Width : ");
        int Width = sc.nextInt();
        int area = 2 * (length + Width);
        System.out.println("The area of rectangle is " + area);
        sc.close();
    }
}