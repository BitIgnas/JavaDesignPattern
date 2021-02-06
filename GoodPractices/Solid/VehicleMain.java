package GoodPractices.Solid;

import java.time.LocalDate;

/**
 * SOLID
 *
 * L - Liskov's substitution principle. (Liskovo pakeitimo principas)
 *
 * If class A is a subtype of class B. (Jei klase A yra B klases vaikas)
 * then we should eb able to replace B with A without disrupting the behavior of the program.
 */

public class VehicleMain {

    public static void main(String[] args) {

        InspectionService inspectionService = new InspectionService();

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("BMW");
        vehicle.setModel("525");
        vehicle.setLicensePlate("SDA999");
        vehicle.setFabricateDate(LocalDate.of(2018, 4, 4));
        vehicle.setLastInspection(LocalDate.of(2020, 1, 1));

        inspectionService.executeAnnualInspection(vehicle);


        Car car = new Car();
        car.setBrand("Audi");
        car.setModel("A6");
        car.setLicensePlate("SDA 123");
        car.setFabricateDate(LocalDate.of(2018, 8, 1));
        car.setLastInspection(LocalDate.of(2017, 1, 1));

        car.setNumberOfDoors(4);

        inspectionService.executeAnnualInspection(car);
    }

}
