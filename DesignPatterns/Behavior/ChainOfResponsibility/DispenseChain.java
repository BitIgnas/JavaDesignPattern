package DesignPatterns.Behavior.ChainOfResponsibility;

/**
 * Base interface should have a method to define
 * the next processor an method to process the request.
 *
 * Eg. Method will work with next request. Method will
 * show how to handle method.
 *
 * Our case - we need different processor classes, to
 * dispense different amounts of money.
 *
 * 50, 20, 10 amount of bill can be used. So we will need 3
 * different implementations.
 */
public interface DispenseChain {

    //next chain part select
    void setNextChain(DispenseChain nextChain);


    //money dispenser
    void dispense(Currency currency);
}
