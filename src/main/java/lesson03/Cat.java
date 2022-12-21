package lesson03;

public class Cat extends Animal {
    private static int catCount = 0;

    public Cat() {
        catCount++;
        runLimit = 200;
        swimLimit = 0;
    }
}