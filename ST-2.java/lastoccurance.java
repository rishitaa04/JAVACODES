// package arr;

import java.util.Scanner;

class Array5 {

    void CodingArray() {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int x = sc.nextInt();
        int ans = 0;

        int arr[] = new int[7];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) {
                ans = j;
            }
        }

        System.out.print(ans);

    }

}

public class lastoccurance {
    public static void main(String[] args) {
        Array5 obj5 = new Array5();
        obj5.CodingArray();
    }
}