package lesson03;

public class Dog extends Animal {
    private static int countDog = 0;

    public Dog() {
        runLimit = 200;
        swimLimit = 0;
        countDog++;
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength <= 10) {
            System.out.println("The dog swam " + obstacleLength + " meters.");
        } else {
            System.out.println("The dog couldn't swim that far.");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}