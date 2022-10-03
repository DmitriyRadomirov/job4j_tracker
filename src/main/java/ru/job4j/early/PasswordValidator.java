package ru.job4j.early;

import java.util.Locale;

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
        if (!password.matches("(.*[0-9]+.*)")) {
            throw new IllegalArgumentException("Password must be including a number");
        }
        if (password.toLowerCase().contains("qwerty")) {
            throw new IllegalArgumentException("Рassword must not contain \"qwerty\" ");
        }
        if (password.toLowerCase().contains("12345")) {
            throw new IllegalArgumentException("Рassword must not contain \"12345\" ");
        }
        if (password.toLowerCase().contains("password")) {
            throw new IllegalArgumentException("Рassword must not contain \"password\" ");
        }
        if (password.toLowerCase().contains("admin")) {
            throw new IllegalArgumentException("Рassword must not contain \"admin\" ");
        }
        if (password.toLowerCase().contains("user")) {
            throw new IllegalArgumentException("Рassword must not contain \"user\" ");
        }
        if (!password.matches("(.*[@#$%^&+=].*)")) {
            throw new IllegalArgumentException("Password must contain special characters");
        }
        return password;
    }
}
