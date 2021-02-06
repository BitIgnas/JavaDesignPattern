package GoodPractices.Solid;

/**
 * SOLID
 *
 * I - Interface segregation principle
 *
 * Interface should be split into smaller ones.
 * By doing so, we can ensure that implementing classes only need to concentrate
 * on specific methods which they need.
 */

public class Plane implements GroundVehicle, AirVehicle {

    //Comes from Common interface
    @Override
    public void accelerate() {
        System.out.println("Acceleration");
    }

    @Override
    public void specificBehavior() {

    }

    @Override
    public void brake() {
        System.out.println("Braking");
    }

    //Comes from Flying interface
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
