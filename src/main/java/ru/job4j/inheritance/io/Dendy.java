package ru.job4j.inheritance.io;

import java.util.Scanner;

public class Dendy {
    /**
     * Это метод возвращает тип данных String. В нашей программе нужно будет String преобразовать в int.
     * Для этого мы будет использовать метод Integer.parseInt
     * У объекта Scanner есть метод nextLine(), который считывает все символы строки после нажатия на клавишу Enter.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена.");
                run = false;
            } else if (select == 1) {
                System.out.println("Танчики загружаются ... ");
            } else if (select == 2) {
                System.out.println("Супер Марио загружается ... ");
            } else {
                System.out.println("Такой игры нет.");
            }
            System.out.println();
        }
    }
}