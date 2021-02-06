package GoodPractices.Solid.DependencyInversion;

//lower level module
public class Developer implements Employee {

    @Override
    public void work() {
        System.out.println("Developer working");
        code();
    }

    private void code() {
        System.out.println("Coding");
    }
}
