package ru.job4j.inheritance;

public class Dantist extends Doctor {
    private String numberOfOperations;

    public Dantist(String name, String surname, String education, String birthday, String degree, String numberOfOperations) {
        super(name, surname, education, birthday, degree);
        this.numberOfOperations = numberOfOperations;
    }

    public String cariesTreatment(String seal) {
        return seal;
    }
}

