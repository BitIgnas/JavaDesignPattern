package GoodPractices.Solid;

import java.time.LocalDate;

//TA
public class InspectionService {

    public void executeAnnualInspection(Vehicle vehicle) {
        System.out.println("Inspecting vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());

        if (vehicle.isInspectionOverdue()) {
            System.out.println("WARNING: vehicle has overdue inspection");
        }

        executeInspectionDuties();

        vehicle.setLastInspection(LocalDate.now());
    }

    private void executeInspectionDuties() {
        //Operations executed by inspector
        System.out.println("Checking brake and windshield"); //Can be different class
        System.out.println("Checking exhaust system"); // new class
        System.out.println("Checking oil levels"); // new class
    }

}
