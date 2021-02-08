package DesignPatterns.Structural.Facade.Example1;

public class CoolingController {

    public void setTemperature(){
        System.out.println("Setting tempeture to 70");
    }

    public void run(){
        System.out.println("Cooling controller is running");
    }

    public void shutdown(){
        System.out.println("Shutting down");
    }
}
