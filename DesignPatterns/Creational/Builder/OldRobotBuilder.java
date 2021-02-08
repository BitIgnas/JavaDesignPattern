package DesignPatterns.Creational.Builder;

public class OldRobotBuilder implements RobotBuilder {

    //Composition
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Old robot head");
    }

    @Override
    public void buildRobotBody() {
        robot.setRobotBody("Old robot body");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Old robot weak legs");
    }

    @Override
    public void buildRobotHands() {
        robot.setRobotHands("Rusty robot hands");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
