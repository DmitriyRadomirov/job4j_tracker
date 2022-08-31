package ru.job4j.poly;

public class AllVehicle {
    public static void main(String[] args) {
        Vihicle bus = new Buses();
        Vihicle plane = new Planes();
        Vihicle train = new Trains();

        Vihicle[] vihicles = new Vihicle[]{bus, plane, train};
        for (Vihicle v : vihicles) {
            v.move();
        }
    }
}
