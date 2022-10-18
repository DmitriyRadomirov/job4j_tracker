package ru.job4j.early;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordValidatorTests {

    @Test
    public void whenPasswordIncorrectLengthLess() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("aaaa");
                });
        assertThat(exception.getMessage()).isEqualTo("Password must be at least 8 and no more than 32 characters long");
    }

    @Test
    public void whenPasswordIncorrectLengthLonger() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("aaaabbbbccccddddeeeeffffgggghhhhk");
                });
        assertThat(exception.getMessage()).isEqualTo("Password must be at least 8 and no more than 32 characters long");
    }

    @Test
    public void whenPasswordIncorrectNoUppercaseLetter() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("aaaabbbb");
                });
        assertThat(exception.getMessage()).isEqualTo("Password must contain at least one uppercase letter");
    }

    @Test
    public void whenPasswordIncorrectNoLowercaseLetter() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("AAAABBBB");
                });
        assertThat(exception.getMessage()).isEqualTo("Password must contain at least one lowercase letter");
    }

    @Test
    public void whenPasswordIncorrectQwerty() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("u123Qwerty+1Aa");
                });
        assertThat(exception.getMessage()).isEqualTo("Рassword must not contain \"qwerty\"");
    }

    @Test
    public void whenPasswordIncorrect12345() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("aa12345+1Aa");
                });
        assertThat(exception.getMessage()).isEqualTo("Рassword must not contain \"12345\"");
    }

    @Test
    public void whenPasswordIncorrectPassword() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("password+1Aa");
                });
        assertThat(exception.getMessage()).isEqualTo("Рassword must not contain \"password\"");
    }

    @Test
    public void whenPasswordIncorrectAdmin() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("adMin+1Aa");
                });
        assertThat(exception.getMessage()).isEqualTo("Рassword must not contain \"admin\"");
    }

    @Test
    public void whenPasswordIncorrectUser() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("useR+1Aa");
                });
        assertThat(exception.getMessage()).isEqualTo("Рassword must not contain \"user\"");
    }

    @Test
    public void whenPasswordIncorrectNoSpecialChar() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("a1aaabbbbAa");
                });
        assertThat(exception.getMessage()).isEqualTo("Password must contain special characters");
    }

    @Test
    public void whenPasswordIncorrectNoDigit() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("A@bAAAaAa");
                });
        assertThat(exception.getMessage()).isEqualTo("Password must be including a number");
    }
}