// package AC4.0.java.conditionalstatement.java.if-else.java;

// import javax.swing.Icon;

public class incometax {
    public static void main(String args[]) {
        int income = 200000;
        if (income < 500000) {
            int tax = 0;
            System.out.println("tax is : " + tax);
        } else if (income >= 500000 && income <= 1000000) {
            int tax = (int) (income * 0.5);
            System.out.println("tax calculated is : " + tax);
        } else {
            int tax = (int) (income * 0.9);
            System.out.println("your tax is : " + tax);
        }
    }
}
