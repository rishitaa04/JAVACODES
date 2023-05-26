// Q.12. Andrew manages a pipe warehouse. He wishes to automate the process of transferring the pipes from the warehouse to the carrier truck. There are N pipes in the warehouse placed vertically along a wall. In the automated system, a drone picks the pipes by length and carries them to the carrier truck. In each turn, the drone moves from left to right to find the pipes whose lengths are greater than the pipe on their left. After finding the pipe, the drone takes the pipe to the carrier truck. The drone repeats this process until it has no more pipes to pick.
// Write a Java program to output the list of pipes that will remain in the warehouse after the drone has completed this process.

import java.util.Scanner;

class pipe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] pipes = new int[n];
        for (int i = 0; i < n; i++) {
            pipes[i] = scan.nextInt();
        }
        System.out.print(pipes[0] + " ");
        int temp = pipes[0];
        for (int i = 1; i < n; i++) {
            if (pipes[i] < temp) {
                System.out.print(pipes[i] + " ");
                temp = pipes[i];

            }
        }
        scan.close();

    }
}
