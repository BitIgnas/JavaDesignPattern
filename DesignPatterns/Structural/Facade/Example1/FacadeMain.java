package DesignPatterns.Structural.Facade.Example1;

/**
 * Facade hides the complexity from the client and exposes only to it.
 * Eg. House or Restaurant or Car.
 */

public class FacadeMain {

    public static void main(String[] args) {

        AirFlowController airFlowController = new AirFlowController();
        CoolingController coolingController = new CoolingController();
        FilterSystem filterSystem = new FilterSystem();
        FuelInjector fuelInjector = new FuelInjector();
        Starter starter = new Starter();

        //this is the complexity which we need to simplify for the client.

        airFlowController.takeAir();
        coolingController.run();
        coolingController.setTemperature();
        filterSystem.turnOn();
        filterSystem.filter();
        fuelInjector.turnOn();
        fuelInjector.injectFuel();
        starter.start();

        //we need facade to hide all complexity from user.
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();



    }

}
