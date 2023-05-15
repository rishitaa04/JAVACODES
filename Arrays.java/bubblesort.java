// package Arrays.java;
// package Arrays;

public class bubblesort {
    public static void main(String args[]) {
        int arr[] = { 30, 4, 6, 1, 12 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            System.out.print(arr[i] + " ");
        }
    }
}
