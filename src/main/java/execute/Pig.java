package execute;

public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("The pig says: Wee Wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
