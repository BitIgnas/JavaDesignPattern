package GoodPractices.Solid;

/**
 * SOLID
 *
 * O - open for extensions
 *
 * Stop ourselves from modifying existing code, causing potential new bugs instead extend the class
 */
public class Car extends Vehicle implements GroundVehicle {

    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean isInspectionOverdue() {
        return super.isInspectionOverdue();
        //if needed override method
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate as car");
    }

    @Override
    public void specificBehavior() {
        System.out.println("Car go br br br");
    }

    @Override
    public void brake() {
        System.out.println("Brake as car");

    }

    @Override
    public void fly() {

    }
}
