package lesson01;

public class Animal {
    protected int runLimit;
    protected int swimLimit;
    private static int countAnimal;

    public Animal() {
        countAnimal++;
    }

    public static void main(String[] args) {

        Animal cat = new Cat("Barbaris");
        cat.run(75);
        cat.swim(1);

        Animal dog = new Dog("Geniy");
        dog.run(210);
        dog.swim(7);

        System.out.println("Total number of animals: " + getCountAnimal());
    }

    public void run(int obstacleLength) {}

    public void swim(int obstacleLength) {}

    public static int getCountAnimal() {
        return countAnimal;
    }
}