package DesignPatterns.Creational.FactoryMethod;

public class NotificationMain {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        //if user selected sms, sms will be received
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
