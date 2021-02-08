package DesignPatterns.Behavior.ChainOfResponsibility;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ATMDispenserChain atmDispenserChain = new ATMDispenserChain();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense: ");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();


            if(amount % 10 != 0){
                System.out.println("Amount should be atleast 10");
                break;
            }


            atmDispenserChain.getFirstChainElement().dispense(new Currency(amount));
        }
    }
}
