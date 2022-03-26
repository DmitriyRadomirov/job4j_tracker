package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int sum, int multiply, int minus, int divide) {
        return sum + multiply + minus + divide;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultSum = Calculator.sum(10);
        int resultMultiply = calculator.multiply(20);
        int resultMinus = Calculator.minus(15);
        int resultDivide = calculator.divide(30);
        int rst = calculator.sumAllOperation(resultSum, resultMultiply, resultMinus, resultDivide);
        System.out.println("Sum: " + resultSum);
        System.out.println("Multiply: " + resultMultiply);
        System.out.println("Minus: " + resultMinus);
        System.out.println("Divide: " + resultDivide);
        System.out.println("sumAll: " + rst);
    }
}