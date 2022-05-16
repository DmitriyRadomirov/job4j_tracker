package ru.job4j.oop;

public class Jar {
    private int value; // количество воды

    public Jar(int size) { // "конструктор" объект сосуд с объемом
        this.value = size;
    }

    public void pour(Jar another) { // выливает из second сосуда в first
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10); // первый сосуд
        Jar second = new Jar(5); // второй сосуд
        System.out.println("first : " + first.value + ". second : " + second.value);

        first.pour(second); //У объекта first вызываем метод pour

        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}