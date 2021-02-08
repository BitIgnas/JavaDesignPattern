package DesignPatterns.Creational.Builder;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) { //Any robot implementation RobotBuilder
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return robotBuilder.getRobot();
    }

    public void constructRobot(){
        robotBuilder.buildRobotBody();
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotHands();
        robotBuilder.buildRobotLegs();
    }
}
