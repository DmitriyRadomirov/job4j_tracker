package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Василий Петров");
        student1.setGroup("1");
        student1.setDate("24.08.2021");

        System.out.println("Студент: " + student1.getFullName() + ", " + "Группа № "
                + student1.getGroup() + ", " + "Дата поступления " + student1.getDate());
    }
}
