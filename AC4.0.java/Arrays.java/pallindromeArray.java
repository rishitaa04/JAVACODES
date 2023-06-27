// package AC4.0.java.Arrays.java;

// import javax.sound.midi.Synthesizer;

public class pallindromeArray {
    public static void isPallindrome(int array[], int n) {
        int flag = 0;
        for (int i = 0; i < n / 2 && n != 0; i++) {
            // while (n != 0) {
            if (array[i] != array[n - i - 1]) {
                // System.out.println("pallindrome haii");
                flag = 1;
                break;
                // }
            }
            if (flag == 1) {
                System.out.println("not pallindrome");
            } else {
                System.out.println("is pallindrome");
            }

        }
        // return flag;

    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 8 };
        int n = array.length;
        // System.out.println(n);
        isPallindrome(array, n);

    }
}