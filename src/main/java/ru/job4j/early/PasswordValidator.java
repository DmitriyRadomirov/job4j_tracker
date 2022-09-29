package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password is null");
        }
        if (password.length() <= 8 || password.length() >= 32) {
            throw new IllegalArgumentException("Password must be at least 8 and no more than 32 characters long");
        }
        if (!Character.isUpperCase(Integer.parseInt(password))) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter");
        }
        if (!Character.isLowerCase(Integer.parseInt(password))) {
            throw new IllegalArgumentException("Password must contain at least one lowercase letter");
        }
        if (!Character.isDigit(Integer.parseInt(password))) {
            throw new IllegalArgumentException("Password must be including a number");
        }
        if (!password.matches("[@#$%^&+=]")) {
            throw new IllegalArgumentException("Password must contain special characters");
        }
        if ()
    }



//Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user.
// Без учета регистра,
// значит что, например, ни qwerty ни QWERTY ни qwErty и т.п. не должно быть в составе пароля.