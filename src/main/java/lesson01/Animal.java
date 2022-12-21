package lesson01;

public class Animal {
    protected int runLimit;
    protected int swimLimit;

    public static void main(String[] args) {

        Cat cat = new Cat("Barbaris");
        cat.run(75);
        cat.swim(1);

        Dog dog = new Dog("Geniy");
        dog.run(210);
        dog.swim(7);
    }

    public void run(int obstacleLength) {}

    public void swim(int obstacleLength) {}
}