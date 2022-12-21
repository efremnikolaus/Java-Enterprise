package lesson03;

public class Animal {
    private int runLimit;
    private int swimLimit;

    public void run(int obstacleLength) {
        if (obstacleLength <= runLimit) {
            System.out.println("The animal ran " + obstacleLength + " meters.");
        }
        else {
            System.out.println("The animal couldn't run that far.");
        }
    }

    public void swim(int obstacleLength) {
        if (obstacleLength <= swimLimit) {
            System.out.println("The animal ran " + obstacleLength + " meters.");
        }
        else if ( obstacleLength == 0) {
            System.out.println("I cant swim");
        }
        else {
            System.out.println("The animal couldn't run that far.");
        }
    }

}