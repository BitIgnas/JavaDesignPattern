package DesignPatterns.Creational.FactoryMethod;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {

        System.out.println("sending email to user");

    }
}
