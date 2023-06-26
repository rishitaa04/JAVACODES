import java.util.*;

public class Binarysearch {
    public static int BS(int numbers[], int key) {
        int start = 0;
        int n = numbers.length;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = sc.nextInt();
        // BS(numbers, key);
        // System.out.println("the index is : " + BS(numbers, key));
        System.out.println(BS(numbers, key));
        sc.close();
    }

}
