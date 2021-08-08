package execute;

public class LearnLoop {

    /* Add numbers if the value is less than 20*/
    public void whileLoop(int x) {
        while (x < 20) {
            System.out.println("value of x is: " + x);
            x++;
        }
    }

    /* Add numbers if the value is less than 20*/
    public void forLoop(int a) {
        for(int x = a; x < 20; x++) {
            System.out.println("value of x is: " + x);
        }
    }

    public void doWhileLoop(int x) {
        do {
            System.out.println("value of x is: " + x);
            x++;
        }while (x < 20);
    }


}
