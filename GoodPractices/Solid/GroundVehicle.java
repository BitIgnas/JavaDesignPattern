package GoodPractices.Solid;

public interface GroundVehicle {

    void accelerate();
    void specificBehavior();
    void brake(); //reduce speed
    void fly(); //segregate interface methods.  This fly should belong to another method

}