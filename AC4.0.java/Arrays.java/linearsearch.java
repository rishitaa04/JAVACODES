// package AC4.0.java.Arrays.java;

// import java.security.Key;
// import java.util.Scanner;

public class linearsearch {
    public static void list(String menu[]) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == "wrap") {
                System.out.println(i);
            }
        }

    }

    public static void marking(int numbers[]) {
        // int key;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 8) {
                System.out.println(i);
                break;
            } else {
                System.out.println("not found");
            }
        }
    }

    public static void main(String[] args) {
        String menu[] = { "samosa", "maggie", "wrap", "frappe" };
        list(menu);

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        marking(numbers);
        // sc.close();
    }
}
