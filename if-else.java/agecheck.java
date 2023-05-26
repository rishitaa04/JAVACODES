public class agecheck {
    public static void main(String args[]) {
        int age = 15;
        if (age > 18) {
            System.out.println("greater");
        } else if (age > 18 && age < 12) {
            System.out.println("moderate");
        } else {
            System.out.println("nope");
        }
    }

}
