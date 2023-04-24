import java.util.*;

// import javax.swing.plaf.synth.SynthSpinnerUI;
public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Physics marks : ");
        int physics = sc.nextInt();
        System.out.print("Enter your chemistry marks : ");
        int chemistry = sc.nextInt();
        System.out.print("Enter your maths marks : ");
        int maths = sc.nextInt();
        System.out.print("Enter your english marks : ");
        int english = sc.nextInt();
        ;
        System.out.print("Enter your biology marks : ");
        int biology = sc.nextInt();

        int sum = physics + chemistry + maths + biology + english;
        int average = sum / 5;
        // int average = marks * 100;
        System.out.print("Average is : " + average);
        sc.close();
    }
}
