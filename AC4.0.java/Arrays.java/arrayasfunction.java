// package AC4.0.java.Arrays.java;

public class arrayasfunction {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
            System.out.println(marks[i]);
        }

    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        update(marks);
    }
}
