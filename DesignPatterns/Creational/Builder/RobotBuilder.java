package DesignPatterns.Creational.Builder;

/**
 * Apsirasome standartinius veiksmus skirtus robotui sukurti
 */
public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotBody();
    void buildRobotLegs();
    void buildRobotHands();
    Robot getRobot();
}
