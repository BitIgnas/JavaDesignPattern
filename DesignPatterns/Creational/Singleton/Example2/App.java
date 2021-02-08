package DesignPatterns.Creational.Singleton.Example2;

public class App {

    private static App app;

    public static App getInstance() {
        if (app != null) {
            return app;
        } else {
            app = new App();
            return app;
        }
    }

    public App createApp(){

        return new App();

    }
}

