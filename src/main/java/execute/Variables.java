package execute;

public class Variables {
    int salary = 2000;

    public void adamSalary() {
        System.out.println("Adam salary is: " + salary);
    }

    public void davidSalary() {
        System.out.println("David salary is: " + salary);
    }

    public void intVariables() {
        int salary = 1000;
        System.out.println("My salary is:" + salary);
    }

    public void floatVariables() {
        float price = 45.6f;
        System.out.println("Product price is: " + price);
    }

    public void booleanVariables() {
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is: " + red + " Green light is: " + green);
    }

    public void characterVariables() {
        char alphabet = 'A';
        System.out.println("Alphabet is: " + alphabet);
    }

    public void stringVariables() {
        String name = "Robin";
        String city = "Philadelphia";
        System.out.println("My name is " + name + " I live in " + city);
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
