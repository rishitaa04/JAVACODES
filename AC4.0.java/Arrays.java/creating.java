import java.util.Scanner;

public class creating {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3 };
        System.out.println(numbers[1]);

        String fruits[] = { "apple ", "guava ", "mango" };
        System.out.println(fruits[2]);

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[3]);

        // marks[3] = 100;
        System.out.println(marks[3]);
        float percentage = (marks[0] + marks[1] + marks[3]) / 3;
        System.out.println(percentage);

        System.out.println(marks.length);
        sc.close();
    }
}
