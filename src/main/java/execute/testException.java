package execute;

public class testException {
    public void addNumbers(int[] a, int[] b) {
        try{
            int sum = a[0]+b[0];
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void subtractNumbers(int[] a, int[] b) {
        try{
            int result = a[1]-b[1];
            System.out.println("Subtract = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void multiplyNumbers(int[] a, int[] b) {
        try{
            int result = a[0]*b[0];
            System.out.println("Multiply = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void divideNumbers(int a, int b) {
        try{
            int sum = a/b;
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
