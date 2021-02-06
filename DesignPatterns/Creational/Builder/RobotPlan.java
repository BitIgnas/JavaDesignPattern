package DesignPatterns.Creational.Builder;

//Robot creation instruction described - interface.
public interface RobotPlan {

    void setRobotHead(String head);
    void setRobotBody(String body);
    void setRobotLegs(String legs);
    void setRobotHands(String hands);
}
