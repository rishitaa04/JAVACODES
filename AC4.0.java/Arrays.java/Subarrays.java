// package AC4.0.java.Arrays.java;

public class Subarrays {
    public static void printSubarray(int array[]) {
        int ts = 0;

        for (int i = 0; i < array.length; i++) {
            int start = i;

            for (int j = i; j < array.length; j++) {
                int end = j;
                // int sum = 0;
                // sum += array[j];
                // System.out.print("the sum is " + sum);

                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                ts++;

                System.out.println();
            }
            // return

            System.out.println();
        }
        System.out.println("total no of subarrays is " + ts);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        printSubarray(array);
    }

}
