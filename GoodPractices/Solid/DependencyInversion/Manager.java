package GoodPractices.Solid.DependencyInversion;

/**
 * SOLID
 * <p>
 * D - Dependency Inversion should not be dependant on Lower level modules.
 * <p>
 * Instead both higher and lower level modules should be dependant on abstraction.
 * <p>
 * Manager - higher level module
 * Developer - lower level module
 */
public class Manager {

    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void manage(){
        employee.work();
    }
}
