public class reverseanarray {

    public static void reverse(int arr[]) {
        int last = arr.length - 1;
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            // int last
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
        }
        first++;
        last--;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println("ORIGINAL ARRAY");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("REVERSED ARRAY");
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
