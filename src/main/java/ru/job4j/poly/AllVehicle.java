package ru.job4j.poly;

public class AllVehicle {
    public static void main(String[] args) {
        Vihicle bus = new Bus();
        Vihicle plane = new Plane();
        Vihicle train = new Train();

        Vihicle[] vihicle = new Vihicle[]{bus, plane, train};
        for (Vihicle v : vihicle) {
            v.move();
        }
    }
}
