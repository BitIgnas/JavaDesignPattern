package DesignPatterns.Structural.Facade.Example1;

public class CarEngineFacade {

    private AirFlowController airFlowController = new AirFlowController();
    private CoolingController coolingController = new CoolingController();
    private FilterSystem filterSystem = new FilterSystem();
    private FuelInjector fuelInjector = new FuelInjector();
    private Starter starter = new Starter();

    public void startEngine(){

        airFlowController.takeAir();
        coolingController.run();
        coolingController.setTemperature();
        filterSystem.turnOn();
        filterSystem.filter();
        fuelInjector.turnOn();
        fuelInjector.injectFuel();
        starter.start();

    }

    public void stopEngine(){
        System.out.println("Engine is stopped");
    }
}
