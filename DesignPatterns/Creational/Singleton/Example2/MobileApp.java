package DesignPatterns.Creational.Singleton.Example2;

import java.time.LocalDate;

public class MobileApp {

    String name;
    String type;
    LocalDate releaseYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }
}
