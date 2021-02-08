package DesignPatterns.Behavior.ChainOfResponsibility;

public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 20) {
            int numberOfNotes = amount / 20;
            int remainder = amount % 20;
            System.out.println("Dispensing " + numberOfNotes + " 20$ notes");

            if (remainder != 0) {
                //sending remainder to other chain part
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
