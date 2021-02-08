package DesignPatterns.Creational.Builder;

public class TeslaRobotBuilder implements RobotBuilder {

    private  Robot robot;

    public TeslaRobotBuilder() {

    }

    @Override
    public void buildRobotHead() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotBody() {

    }

    @Override
    public void buildRobotLegs() {

    }

    @Override
    public void buildRobotHands() {

    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
