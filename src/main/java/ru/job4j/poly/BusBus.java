package ru.job4j.poly;

public class BusBus implements Transport {

    @Override
    public void run() {
        System.out.println("The bus is operated by autopilot");
    }

    @Override
    public void passengers(int count) {
        int priceBusTicket = 1;
        int sumPerTrip;
        sumPerTrip = count * priceBusTicket;
    }

    @Override
    public int refueling(int numOfLiters) {
        int priceFuel = 60;
        int sumPerFuel;
        sumPerFuel = numOfLiters * priceFuel;
       return sumPerFuel;
    }
}