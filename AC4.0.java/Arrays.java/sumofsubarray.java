// package AC4.0.java.Arrays.java;

public class sumofsubarray {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8 };
        for (int i = 0; i < array.length; i++) {
            int current = i;
            for (int j = i; j < array.length; j++) {
                int last = j;
                for (int k = current; k <= last; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }

    }
}
