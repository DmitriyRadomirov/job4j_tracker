package ru.job4j.tracker;

public class Exit implements UserAction {
    @Override
    public String name() {
        return "Exit Program";
    }

    public Boolean execute(Input input, Tracker tracker) {
        System.out.println("Программа завершена");
        return false;
    }
}