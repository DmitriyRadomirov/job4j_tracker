package ru.job4j.early;

public class PasswordValidator {
    @SuppressWarnings("checkstyle:ParenPad")
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
        for (int i = 0; i <= subString.length - 1; i++) {
            if (password.toLowerCase().contains(subString[i])) {
                throw new IllegalArgumentException("Рassword must not contain" + " \"" + subString[i] + "\"");
            }
        }
        String[] specChar = {"@", "#", "$", "%", "^", "&", "+", "="};
        for (int k = 0; k < specChar.length; k++) {
            if (password.contains(specChar[k])) {
                break;
            } else {
                throw new IllegalArgumentException("Password must contain special characters");
            }
        }
        for (char c : password.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Password must be including a number");
            }
        }
        return password;
    }
}