// package Oops.java;

class student {
    int rollno = 2110992010;
    String name = "Rishita";
    int group = 22;
}

public class main {
    public static void main(String args[]) {
        student obj2 = new student();
        obj2.rollno = 1;
        obj2.name = "rahul";
        System.out.println(obj2.rollno);
        System.out.println(obj2.name);
        System.out.println(obj2.group);
        // return "yes";

        student obj3 = new student();
        System.out.println(obj3.name);
        System.out.println(obj3.group);
    }
}
