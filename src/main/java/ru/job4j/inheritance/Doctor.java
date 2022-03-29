package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String degree;

    public Doctor(String name, String surname, String education, String birthday, String degree) {
        super(name, surname, education, birthday);
        this.degree = degree;
    }

    public String diagnosisOfIseases(String diarnosisHeal) {
        return diarnosisHeal;
    }
 }
