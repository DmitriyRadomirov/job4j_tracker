package ru.job4j.poly;

public interface Transport {
    int run();

    int passengers(int count);

    int refueling(int numOfLiters, int price);

}
