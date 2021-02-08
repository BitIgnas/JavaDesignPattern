package DesignPatterns.Creational.Singleton.Example1;

public class Main {

    public static void main(String[] args) {
        ComputerProducer computerProducer = ComputerProducer.getComputerProducer();
        computerProducer.showProducedComputerCount();

        Computer lenovo = computerProducer.produceComputer();
        Computer asus = computerProducer.produceComputer();
        Computer dell = computerProducer.produceComputer();

        computerProducer.showProducedComputerCount();

    }
}
