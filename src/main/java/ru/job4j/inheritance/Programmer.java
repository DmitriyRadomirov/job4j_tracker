package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String program;

    public Programmer(String name, String surname, String education, String birthday, String plan, String program) {
        super(name, surname, education, birthday, plan);
        this.program = program;
    }

    public String coder(String code) {
        return code;
    }
}
