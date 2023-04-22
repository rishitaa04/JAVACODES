import java.util.*;

public class inputoutput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input daalo : ");
        String input = sc.next();
        System.out.print("Input daalo : ");
        int integer = sc.nextInt();
        System.out.print("Input daalo : ");
        float value = sc.nextFloat();
        sc.nextLine();
        System.out.print("Input daalo : ");
        String line = sc.nextLine();
        System.out.println("String value 1 is : " + input);
        System.out.println("Integer value is : " + integer);
        System.out.println("Floating value is : " + value);
        System.out.println("Sentence is : " + line);
        sc.close();
    }
}
