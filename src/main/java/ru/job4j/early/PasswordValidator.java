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
        /*
        if (!password.matches("(.*[0-9]+.*)")) {
            throw new IllegalArgumentException("Password must be including a number");
        }

        }
        if (!password.matches("(.*[@#$%^&+=].*)")) {
            throw new IllegalArgumentException("Password must contain special characters");
                     */
        String[] name = {"user", "admin", "password", "12345", "qwerty"};
        for (int i = 0; i <= name.length - 1; i++) {
            if (password.toLowerCase().contains(name[i])) {
                throw new IllegalArgumentException("Рassword must not contain " + "\"" + name[i] + "\" ");
            }
        }
        String[] number = {"1", "2", "3"};
        int i = 0;
        while (i <= number.length - 1) {
            for (int j = 0; j <= number.length - 1; j++) {
                if (!password.contains(number[j])) {
                    i++;
                } else {
                    break;
                }
            }
            throw new IllegalArgumentException("Password must be including a number");
        }
        String[] specChar = {"@", "#", "$", "%", "^", "&", "+", "="};
        while (i <= number.length - 1) {
            for (int j = 0; j <= number.length - 1; j++) {
                if (!password.contains(number[j])) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Password must contain special characters");
                }
            }
        }
        return password;
    }
}
