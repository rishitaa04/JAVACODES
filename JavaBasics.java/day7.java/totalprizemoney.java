
// In a coding contest, there are prizes for the top rankers. The prize scheme
// is as follows: Top 10 participants receive rupees X each. Participants with
// rank 11 to 100 (both inclusive) receive rupees Y each.
import java.util.*;

class totalprizemoney {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int x = read.nextInt();
            int y = read.nextInt();

            int prize_top10 = 10 * x;

            int prize_11to100 = 100 * y;
            System.out.println(prize_top10 + prize_11to100);
            read.close();
        }
    }
}
