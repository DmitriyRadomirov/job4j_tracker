package ru.job4j.ex;

import java.util.Arrays;

public class BackArray {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nuk", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
