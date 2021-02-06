package GoodPractices.Solid.DependencyInversion;

/**
 * lower level module
 */
public class Architect implements Employee {

    @Override
    public void work(){
        System.out.println("Architect working");
    }
}
