package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password is null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password must be at least 8 and no more than 32 characters long");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password must contain at least one lowercase letter");
        }
        String[] subString = {"qwerty", "12345", "password", "admin", "user"};
        for (int i = 0; i < subString.length; i++) {
            if (password.toLowerCase().contains(subString[i])) {
                throw new IllegalArgumentException("Рassword must not contain" + " \"" + subString[i] + "\"");
            }
        }
        boolean a = false;
        for (char c : password.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                a = true;
                break;
            }
        }
        if (!a) {
            throw new IllegalArgumentException("Password must contain special characters");
        }
        boolean b = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                b = true;
                break;
            }
        }
        if (!b) {
            throw new IllegalArgumentException("Password must be including a number");
        }
        return password;
    }
}