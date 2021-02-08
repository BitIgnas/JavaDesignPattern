package DesignPatterns.Creational.Builder;

/**
 * Builder (Creational) is used to create objects made from other objects.
 * When you need to create objects which consists of other objects
 * Builder knows the specific of creation of those objects.
 */
public class BuilderMain {

    //Let's say we are creating a game with robots.
    public static void main(String[] args) {

        RobotBuilder builder = new OldRobotBuilder(); //Created enviroment that robot can be created

        RobotEngineer engineer = new RobotEngineer(builder);

        engineer.constructRobot();

        Robot firstRobot = engineer.getRobot();
        System.out.println(firstRobot);

        engineer = new RobotEngineer(new TeslaRobotBuilder());
        engineer.constructRobot();
    }
}
