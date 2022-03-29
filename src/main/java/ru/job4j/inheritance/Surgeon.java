package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String numberOfOperations;

    public Surgeon(String name, String surname, String education, String birthday, String degree, String numberOfOperations) {
        super(name, surname, education, birthday, degree);
        this.numberOfOperations = numberOfOperations;
    }

    public String surgicalOperation(String stitch) {
        return stitch;
    }
}
