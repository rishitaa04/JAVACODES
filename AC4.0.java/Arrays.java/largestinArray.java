// package AC4.0.java.Arrays.java;

public class largestinArray {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int numbers[] = { 1, 2, 3, 4, 5, 6, -4, -3, 0 };
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
