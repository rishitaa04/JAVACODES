public class protection {
    // public static void main(String args[])
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public protection() {
        System.out.println("Base constructor");
        System.out.println(" n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pub = " + n_pub);
    }
}

// package p1;
class Derived extends protection {
    Derived() {
        System.out.println("Derived constructor");
        System.out.println("n = " + n);
        // System.out.println("n_pri = " 4 +n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class samepackage {
    samepackage() {
        protection p = new protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}