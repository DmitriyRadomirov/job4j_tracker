package ru.job4j.io;

import java.util.Scanner;

public class Matches {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;

            if (count == 1) {
                System.out.println("Не верное число. " + player + " введите число 1");
                matches = Integer.parseInt(input.nextLine());
            } else if (count == 2) {
                System.out.println("Не верное число. " + player + " введите число 1 или 2");
                matches = Integer.parseInt(input.nextLine());
            } else if (count == 3) {
                System.out.println("Не верное число. " + player + " введите число от 1 до 3");
                matches = Integer.parseInt(input.nextLine());
            }
            while (matches > 3 && count > 0) {
                System.out.println("Не верное число. " + player + " введите число от 1 до 3:");
                matches = Integer.parseInt(input.nextLine());
            }

            for (int i = 11; i <= 11; i++) {
                count -= matches;
                System.out.println("На столе осталось " + count + " спичек");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}