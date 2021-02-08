package DesignPatterns.Behavior.ChainOfResponsibility;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 50) {
            int numberOfNotes = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing " + numberOfNotes + " 50$ notes");

            if (remainder != 0) {
                //sending remainder to other chain part
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}

