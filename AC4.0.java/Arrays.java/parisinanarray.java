// package AC4.0.java.Arrays.java;

public class parisinanarray {
    public static void pairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.println("(" + current + "," + array[j] + ")");

            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10 };
        pairs(array);
    }
}
