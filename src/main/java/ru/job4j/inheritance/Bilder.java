package ru.job4j.inheritance;

public class Bilder extends Engineer {
    private String house;

    public Bilder(String name, String surname, String education, String birthday, String plan, String house) {
        super(name, surname, education, birthday, plan);
        this.house = house;
    }

    public int multiStoreyBuilding(int floor) {
        return floor;
    }
}
