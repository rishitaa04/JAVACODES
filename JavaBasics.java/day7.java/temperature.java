import java.util.*;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Farenheit temperature ");
        float faren = sc.nextFloat();
        // System.out.println("Celcius temperature ");
        float Celcius = ((faren - 32) * 5) / 9;
        System.out.println("Temperature after conversion is : " + Celcius);
        sc.close();
    }

}
