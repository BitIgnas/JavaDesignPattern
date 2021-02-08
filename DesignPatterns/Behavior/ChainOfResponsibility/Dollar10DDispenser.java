package DesignPatterns.Behavior.ChainOfResponsibility;

public class Dollar10DDispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) { //example. nextChain = Dollar20Dispenser
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10){
            int numberOfNotes = currency.getAmount() / 10; //how many notes?
            int remainder = currency.getAmount() % 10; //remainder
            System.out.println("Dispensing " + numberOfNotes + " 10$ notes");

            //next chain part
            //we setted in setNextChain() method
            if(remainder != 0){
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            //if i dont need this value
            //i sent it forward
            this.chain.dispense(currency);
        }
    }
}
