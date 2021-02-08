package DesignPatterns.Creational.Singleton.Example2;

public class AppMain {

    public static void main(String[] args) {

        App app = new App();
        App.getInstance();

        App intellij = App.getInstance();
        App git = App.getInstance();
        App mysql = App.getInstance();





    }
}
