
// package programiz.java;
import java.util.*;

// import javax.sound.midi.Synthesizer;

public class countnumberofdigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;

        }
        sc.close();
        System.out.println(count);
    }
}
