package GoodPractices.Solid;

import java.time.LocalDate;
import java.time.Period;

/**
 * SOLID
 *
 * Single Responsibility - (Viena atsokomybe)
 *
 * Class should have only one responsibility
 */
public class Vehicle {

    private String brand;
    private String model;
    private LocalDate fabricateDate;
    private String licensePlate;
    private LocalDate lastInspection;
    //Car specific things
    //motorcycle specific things
    //etc...

    public boolean isInspectionOverdue() {
        LocalDate currentTime = LocalDate.now();
        Period timeSinceLastInspection = Period.between(lastInspection, currentTime);

        int differentInYears = timeSinceLastInspection.getYears();


        return differentInYears >= 1 ? true : false; //if true or false return

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getFabricateDate() {
        return fabricateDate;
    }

    public void setFabricateDate(LocalDate fabricateDate) {
        this.fabricateDate = fabricateDate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public LocalDate getLastInspection() {
        return lastInspection;
    }

    public void setLastInspection(LocalDate lastInspection) {
        this.lastInspection = lastInspection;
    }
}
