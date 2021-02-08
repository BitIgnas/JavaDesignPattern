package DesignPatterns.Behavior.ChainOfResponsibility;

public class ATMDispenserChain {

    private DispenseChain firstChainElement;

    public ATMDispenserChain() {
        //initialize the chain
        //Specify first element of the chain
        this.firstChainElement = new Dollar50Dispenser();

        DispenseChain secondChainElement = new Dollar20Dispenser();
        DispenseChain thirdChainElement = new Dollar10DDispenser();

        firstChainElement.setNextChain(secondChainElement);
        secondChainElement.setNextChain(thirdChainElement);

    }

    public DispenseChain getFirstChainElement() {
        return firstChainElement;
    }
}
