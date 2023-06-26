// package AC4.0.java.Arrays.java;

public class smallest {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int numbers[] = { 2, 1, 0, -3, 8, 6 };
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
    }
}
