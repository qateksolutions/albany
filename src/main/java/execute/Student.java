package execute;

public class Student {
    int a;
    static int b;

    Student() {
        b++;
    }

    public void showData() {
        System.out.println("Value of A = " + a);
        System.out.println("Value of B = " + b);
    }
}
