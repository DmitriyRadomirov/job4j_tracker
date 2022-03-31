package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book01 = new Book("Java", 500);
        Book book02 = new Book("Pyton", 350);
        Book book03 = new Book("C++", 700);
        Book book04 = new Book("Clean code", 464);
        Book[] lib = new Book[4];
        lib[0] = book01;
        lib[1] = book02;
        lib[2] = book03;
        lib[3] = book04;
        for (int index = 0; index < lib.length; index++) {
            Book lb = lib[index];
            System.out.println(lb.getNameBook() + " - " + lb.getPageCount());
        }
        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;
        for (int index = 0; index < lib.length; index++) {
            Book lb = lib[index];
            System.out.println(lb.getNameBook() + " - " + lb.getPageCount());
        }
        for (int index = 0; index < lib.length; index++) {
            Book lb = lib[index];
            if (lib[index].equals(book04)) {
                System.out.println(lb.getNameBook() + " - " + lb.getPageCount());
            }
        }
    }
}