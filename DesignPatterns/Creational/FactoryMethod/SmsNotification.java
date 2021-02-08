package DesignPatterns.Creational.FactoryMethod;

public class SmsNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending phone sms");
    }

    //more logic, if needed
}
