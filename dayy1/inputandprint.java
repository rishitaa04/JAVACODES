import java.util.*;

public class inputandprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your age : ");
        int age = sc.nextInt();
        System.out.print("Your name : ");
        String name;
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Your name is " + name + " and age is " + age);
        sc.close();
    }
}
