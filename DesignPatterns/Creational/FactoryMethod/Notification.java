package DesignPatterns.Creational.FactoryMethod;

/**
 * Creational type pattern
 *
 * It states that we have to define an interface or abstract class and
 * allow subclasses which object to instantiate.
 *
 * Factory method means that here is a method which acts as a Factory and creates objects(Stuff).
 *
 * Implementation:
 * 1. Define factory method inside the interface
 * 2. Let subclasses implement it and decide which object to create.
 *
 */
public interface Notification {

    void notifyUser();
}
