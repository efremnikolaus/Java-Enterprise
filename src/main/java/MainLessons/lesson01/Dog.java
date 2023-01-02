package MainLessons.lesson01;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;

        runLimit = 500;
        swimLimit = 10;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= runLimit) {
            System.out.println(name + " ran " + obstacleLength + " meters.");
        } else {
            System.out.println(name + " can not run that far.");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength <= swimLimit) {
            System.out.println(name + " swam " + obstacleLength + " meters.");
        }
        else {
            System.out.println(name + " can not swim that far.");
        }
    }
}