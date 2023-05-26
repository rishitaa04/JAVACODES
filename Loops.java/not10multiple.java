// package AC4.0.java.loops.java;

public class not10multiple {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
