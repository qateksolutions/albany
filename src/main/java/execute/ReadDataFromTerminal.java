package execute;

import java.util.Scanner;

public class ReadDataFromTerminal {
    public void getInputFromUser() {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = in.nextLine();
//        System.out.println("You entered string: " + name);
//
//        System.out.printf("Enter your age: ");
//        int age = in.nextInt();
//        System.out.println("Your entered age: " + age);
//
//        System.out.print("Enter Product Price: ");
//        double price = in.nextDouble();
//        System.out.println("Your entered price: " + price);

        System.out.print("Enter value 1: ");
        int value1 = in.nextInt();

        System.out.print("Enter value 2: ");
        int value2 = in.nextInt();

        int sum = value1 + value2;
        System.out.println("My total is: " + sum);
    }
}
