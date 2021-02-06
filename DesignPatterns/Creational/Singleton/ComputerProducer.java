package DesignPatterns.Creational.Singleton;

/**
 * Use singleton to ensure that we would only one ComputerProducer per program.
 * And create global access point to it. (Leisime pasiekti ta objekta is visu programos vietu)
 */

public class ComputerProducer {

   private static ComputerProducer computerProducer;
   private int numberOfComputersProduced;

   //Sigleton is achieved via private Constructor
    private ComputerProducer(){

    }

    public Computer produceComputer(){
        numberOfComputersProduced++;
        return new Computer();
    }

    public void showProducedComputerCount(){
        System.out.println("Produced: " + numberOfComputersProduced + " computers");
    }

    //Global access point
    public static ComputerProducer getComputerProducer() {
        //If instance exist
        if(computerProducer != null) {
            return  computerProducer;
        } else {
            computerProducer = new ComputerProducer();
            return computerProducer;
        }
    }
}
