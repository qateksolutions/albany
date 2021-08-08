package execute;

import java.util.Random;

public class LearnMath {
    public void learnRandom() {
        Random rand = new Random();

        // Generate random integers in range from 0 to 999
        int rand_value1 = rand.nextInt(1000);
        int rand_value2 = rand.nextInt(1000);

        System.out.println("Random Numbers: " + rand_value1);
        System.out.println("Random Numbers: " + rand_value2);

        float rand_float1 = rand.nextFloat();
        float rand_float2 = rand.nextFloat();

        System.out.println("Random Floats: " + rand_float1);
        System.out.println("Random Floats: " + rand_float2);

        double rand_double1 = rand.nextDouble();
        double rand_double2 = rand.nextDouble();

        System.out.println("Random Doubles: " + rand_double1);
        System.out.println("Random Doubles: " + rand_double2);
    }

    public void learnRound() {
        double num1 = 74.45;
        System.out.println(Math.round(num1));

        double num2 = 1337.345587954564;
        System.out.println(Math.round(num2));
    }

    public void learnMax() {
        System.out.println(Math.max(4, 6));
    }

    public void leanMin() {
        System.out.println(Math.min(4, 6));
    }
}
