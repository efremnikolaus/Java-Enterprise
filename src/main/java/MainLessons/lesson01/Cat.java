package MainLessons.lesson01;

public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        this.name = name;

        runLimit = 200;
        swimLimit = 0;
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
        System.out.println(name + " can not swim because cats are afraid to swim.");
    }
}